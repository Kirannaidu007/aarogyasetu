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
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.*;
import static com.connect.*;
import static com.mail.*;

@WebServlet(urlPatterns={"/register"})
public class register extends HttpServlet {

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
        try (PrintWriter out = resp.getWriter()) {
            
            HttpSession ses=req.getSession(false);
           if(ses.getAttribute("check").equals("true"))
            {
                
            int k=0;
            String flag="";
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String to[]={"shrutitiwari8686@gmail.com"};
            String subject="Confirmation mail for Insertion";
            String empcat=req.getParameter("empcat");
            String empmin=req.getParameter("empmin");
            String empdep=req.getParameter("empdep");
            String empsub=req.getParameter("empsub");
            String dom=req.getParameter("dom");
            String boid=req.getParameter("boid");
            String empcoor=req.getParameter("empcoor");
            String cemail=req.getParameter("cemail");
            String aemail=req.getParameter("aemail");
            HashMap<String,String> data=new HashMap<>();
            if(!cemail.contains("@")&& cemail.contains("."))
            {
                flag="1";
                ses.setAttribute("flag", flag);
                resp.sendRedirect("adddata.jsp");
            }
            else if(!aemail.contains("@")&& aemail.contains("."))
            {
              flag="2";
              ses.setAttribute("flag", flag);
              resp.sendRedirect("adddata.jsp");
           
            }
            else if(!dom.contains("."))
            {
                flag="3";
                ses.setAttribute("flag", flag);
                resp.sendRedirect("adddata.jsp");
           
            }
            else
            {
            data.put("Category",empcat);
            data.put("Ministry",empmin);
            data.put("Department",empdep);
            data.put("Domain",dom);
            data.put("Coordinator",empcoor);
            data.put("Coordinator email",cemail);
            data.put("Admin email",aemail);
            String body="<p><strong>Dear Sir/Ma'am,</strong><br><br><b>Following details have been entered by a user</b><br><br><b>Employee Category:</b>"+data.get("Category")+"<br><br><b>Employee Ministry:</b>"+data.get("Ministry")+"<br><br><b>Employee Department:</b>"
                    +data.get("Department")+"<br><br><b>Employee Domain:</b>"+data.get("Domain")+"<br><br><b>Employee Coordinator:</b>"+data.get("Coordinator")+"'<br><br><b>Coordinator Mail:</b>"+data.get("Coordinator email")+"<br><br><b>Admin mail:</b>"+data.get("Admin email")
                    + "<br></p>";
           
            
            
            pst = makeConnection("insert into employment_coordinator (emp_category,emp_min_state_org,emp_dept,emp_domain,emp_coord_name,emp_coord_email,emp_admin_email,emp_status,emp_createdon)values('"+empcat+"','"+empmin+"','"+empdep+"','"+dom+"','"+empcoor+"','"+cemail+"','"+aemail+"','a','"+timestamp+"')");
           
            
           
            k=pst.executeUpdate();
            out.println(k);
            if(k>0)
            {
               sendmail("shrutitiwari8686@gmail.com","Aspire@009",to,subject,body);
               out.println("<script type=\"text/javascript\">");
               out.println("alert('Values Saved,Kindly check your mail for confirmation');");
               out.println("location='adddata.jsp';");
               out.println("</script>");
             
            }
            
            else
            {
              out.println("Unsuccessful");
            }
            }
            } 
           else if(!ses.getAttribute("check").equals("true"))
            {
               out.println("Access Denied");
            }
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
        
    }

    

}
