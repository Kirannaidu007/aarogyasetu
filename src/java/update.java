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
import java.sql.*;
import com.connect.*;
import static com.connect.makeConnection;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import org.json.*;
import model.employee;
import java.util.*;
/**
 *
 * @author AAKRITI
 */

public class update extends HttpServlet{

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
            
           
            String cat=request.getParameter("empcat");
            String dept=request.getParameter("empdep");
            String min=request.getParameter("empmin");
            System.out.println(cat);
            System.out.println(min);
            System.out.println(dept);
            if(dept!=null)
            {
            if(dept.equalsIgnoreCase("Select a department"))
            {        
             pst=makeConnection("select * from employment_coordinator WHERE emp_category='"+cat+"' AND emp_min_state_org='"+min+"'");
            }
            else
            {
             pst=makeConnection("select * from employment_coordinator WHERE emp_category='"+cat+"' AND emp_min_state_org='"+min+"' AND emp_dept='"+dept+"'");
           
            }
           }
            
            else
            {
                pst=makeConnection("select * from employment_coordinator WHERE emp_category='"+cat+"' AND emp_min_state_org='"+min+"'");
            }
              rs=pst.executeQuery();
              
              
              List<employee> list = new ArrayList<employee>();

                while(rs.next())
              {
                 employee obj=new employee();
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
                
            
          session.setAttribute("employee",list);
          RequestDispatcher rd=request.getRequestDispatcher("previewnew.jsp");
          rd.forward(request, response);
            
       
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
    ResultSet updateRecord(String cmail,String empcat,String empmin,String empdep)
    {
        ResultSet rs1=null;
        int k=0;
        try
        {
        PreparedStatement pst=makeConnection("update employment_coordinator set emp_category='"+empcat+"',emp_min_state_org='"+empmin+"',emp_dept='"+empdep+"' Where emp_coord_email='"+cmail+"'");
         k=pst.executeUpdate();
         System.out.println(k);
         
         }
        catch(Exception e)
        {
           e.printStackTrace();
        }
      return rs1;
    }
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
        processRequest(request,response);
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

