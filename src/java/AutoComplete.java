
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import org.json.*;
import static com.connect.*;
import java.sql.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/Auto"})
public class AutoComplete extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            String coremail = req.getParameter("tags");
            String category=req.getParameter("cat");
            
            System.out.println(coremail);
            System.out.println(category);
            ArrayList<String> al = new ArrayList<String>();
            ArrayList<String> output = new ArrayList<String>();
            PreparedStatement pst = makeConnection("select distinct emp_coord_email from employment_coordinator where emp_coord_email LIKE ?");
            pst.setString(1,"%"+coremail+"%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) 
            {
                al.add(rs.getString("emp_coord_email"));
            }
            
            JSONArray json = new JSONArray(al);
            resp.setContentType("application/json");
            resp.getWriter().print(json);
            
             
        }
       
        catch (Exception e) {
            e.printStackTrace();
        }
           
    }
     public ResultSet show(String email,String cat)
        {
          ResultSet rs1=null;  
          try
          {
          PreparedStatement pstnew=makeConnection("select * from employment_coordinator WHERE emp_coord_email='"+email+"' AND emp_category='"+cat+"'");
          rs1=pstnew.executeQuery();
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
          return rs1;
        }
}
