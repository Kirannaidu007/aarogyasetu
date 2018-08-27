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
import java.sql.*;
import javax.servlet.annotation.*;
@WebServlet(urlPatterns={"/showdata"})
public class showdata extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static PreparedStatement pst;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        try 
        {
            pst=makeConnection("select * from employment_coordinator");
            ResultSet rs=pst.executeQuery();
  
            out.println("<table border=1 width=50% height=50% cellspacing=1 cellpadding=2>");
            out.println("<tr><th>EmpId</th><th>Emp_Category</th><th>Emp_Ministry</th><th>Emp_Department</th><th>Emp_SubDepartment</th><th>Emp_Domain</th><th>Emp_Boid</th><th>Emp_Coordinator</th><th>Coordinator_Email</th><th>Admin_Email</th></tr>");
            
             while (rs.next()) {
                int empid=rs.getInt(1);
                String empcat=rs.getString(2);
                String empmin=rs.getString(3);
                String empdep=rs.getString(4);
                String empsub=rs.getString(5);
                String dom=rs.getString(8);
                String boid=rs.getString(9);
                String empcoor=rs.getString(10);
                String cemail=rs.getString(11);
                String aemail=rs.getString(12);
               out.println("<tr><td>" +empid+ "</td><td>" + empcat + "</td><td>" + empmin+ "</td><td>" + empdep+ "</td><td>" + empsub+ "</td><td>" +dom+ "</td><td>" +boid+ "</td><td>" + empcoor+ "</td><td>" +cemail+ "</td><td>" +aemail+ "</td></tr>"); 
         
             }
             out.println("</table>");
             out.println("</html></body>");
              pst.close();
            
          
        }
        catch(Exception e)
        {
            
        }
    }

}
