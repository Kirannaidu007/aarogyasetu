/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import java.util.HashMap;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class delete extends HttpServlet {

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
             PreparedStatement pst=null;
             ResultSet rs=null;
            HttpSession session=request.getSession();
             String to[]={"shrutitiwari8686@gmail.com"};
             String subject="Confirmation mail for deletion";
              
            
           
           int id=Integer.parseInt(request.getParameter("but"));
           System.out.println(id);
           pst=makeConnection("delete from employment_coordinator where emp_id='"+id+"'");
           int k=pst.executeUpdate();
           HashMap<String,String> data=new HashMap<>();
            data.put("id",String.valueOf(id));
           String body="<p><strong>Dear Sir/Ma'am,</strong><br><br><b>Details for Employee Id-"+data.get("id")+" have been deleted</b><br><br></p>";
         
           if(k>0)
            {
                 sendmail("shrutitiwari8686@gmail.com","DpgitM12",to,subject,body);
               
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Values Deleted,Kindly check your mail for confirmation');");
                 out.println("location='homenew.jsp'");
                 out.println("</script>");
                 System.out.println("Values Deleted");
            
            }
            else
            {
              System.out.println("Unsuccessful");
            }
                   
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
