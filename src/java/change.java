
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.connect.*;
import static com.mail.sendmail;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import java.util.*;
import model.employee;

public class change extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int id=Integer.parseInt(request.getParameter("update2"));
            System.out.println(id);
            String to[]={"shrutitiwari8686@gmail.com"};
            String subject="Confirmation mail for updation";
           
            String empcat=request.getParameter("empcat");
            String empmin=request.getParameter("empmin");
            String empdep=request.getParameter("empdep");
            HttpSession session=request.getSession();
            String dom=request.getParameter("dom");
            
            String empcoor=request.getParameter("empcoor");
            String cemail=request.getParameter("cemail");
            String aemail=request.getParameter("aemail");
            HashMap<String,String> data=new HashMap<>();
            data.put("id",String.valueOf(id));
            data.put("Category",empcat);
            data.put("Ministry",empmin);
            data.put("Department",empdep);
            data.put("Domain",dom);
            data.put("Coordinator",empcoor);
            data.put("Coordinator email",cemail);
            data.put("Admin email",aemail);
            String body="<p><strong>Dear Sir/Ma'am,</strong><br><br><b>Details for Employee Id-"+data.get("id")+" have been updated</b><br><br><b>Employee Category:</b>"+data.get("Category")+"<br><br><b>Employee Ministry:</b>"+data.get("Ministry")+"<br><br><b>Employee Department:</b>"
                    +data.get("Department")+"<br><br><b>Employee Domain:</b>"+data.get("Domain")+"<br><br><b>Employee Coordinator:</b>"+data.get("Coordinator")+"<br><br><b>Coordinator Mail:</b>"+data.get("Coordinator email")+"<br><br><b>Admin mail:</b>"+data.get("Admin email")
                    + "<br></p>";
         
             PreparedStatement pst=makeConnection("update employment_coordinator set emp_category='"+empcat+"',emp_min_state_org='"+empmin+"',emp_dept='"+empdep+"',emp_domain='"+dom+"',emp_coord_name='"+empcoor+"',emp_coord_email='"+cemail+"',emp_admin_email='"+aemail+"' where emp_id='"+id+"'");
             int k=pst.executeUpdate();
             if(k>0)
             {
                 sendmail("shrutitiwari8686@gmail.com","Aspire@009",to,subject,body);
                  System.out.println("Values updated");
             }
             System.out.println(id);
             pst=makeConnection("select * from employment_coordinator where emp_id='"+id+"'");
             ResultSet rs=pst.executeQuery();
             List<model.employee> list = new ArrayList<model.employee>();
    
                while(rs.next())
              {
                 model.employee obj=new model.employee();
                 obj.setId(rs.getInt(1));
                 System.out.println(obj.getId());
                 obj.setCat(rs.getString(2));
                 obj.setMin(rs.getString(3));
                 obj.setDep(rs.getString(4));
                 obj.setDom(rs.getString(8));
                 obj.setCoor(rs.getString(10));
                 obj.setCmail(rs.getString(11));
                 obj.setAmail(rs.getString(12));
                 list.add(obj);
                
            }
              session.setAttribute("list",list);
              response.sendRedirect("finalnew.jsp");
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
