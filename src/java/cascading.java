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
import static com.connect.*;
import java.util.ArrayList;
import org.json.JSONArray;
public class cascading extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            String category=req.getParameter("cat");
            String min=req.getParameter("min");
            int c=Integer.parseInt(req.getParameter("check"));
            System.out.println(c);
            System.out.println(category);
            
            if((category!=null)&&(min==null))
            {
            PreparedStatement pst=makeConnection("select distinct emp_min_state_org from employment_coordinator WHERE emp_category='"+category+"'");
            ResultSet rs=pst.executeQuery();
            ArrayList<String>al = new ArrayList<String>();
             while (rs.next()) 
            {
                al.add(rs.getString("emp_min_state_org"));
            }
            JSONArray json = new JSONArray(al);
            resp.setContentType("application/json");
            resp.getWriter().print(json);
            }
            else
            {
               PreparedStatement pstnew=makeConnection("select distinct emp_dept from employment_coordinator WHERE emp_min_state_org='"+min+"'");
            ResultSet rsnew=pstnew.executeQuery();
            ArrayList<String>al = new ArrayList<String>();
             while (rsnew.next()) 
            {
                al.add(rsnew.getString("emp_dept"));
            }
            JSONArray json = new JSONArray(al);
            resp.setContentType("application/json");
            resp.getWriter().print(json); 
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
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
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
