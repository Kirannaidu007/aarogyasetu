/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.connect.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AAKRITI
 */
public class display extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) 
        {
            String email=request.getParameter("tags");
            
            System.out.println(email);
            HttpSession session=request.getSession();
            PreparedStatement pst=makeConnection("select * from employment_coordinator WHERE emp_coord_email='"+email+"' ");
            ResultSet rs=pst.executeQuery();
            if(!rs.isBeforeFirst())
            {
               out.println("<script type=\"text/javascript\">");
               out.println("alert('No records found');");
               out.println("location='homenew.jsp';");
               out.println("</script>");

            }
            else
            {
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
               response.sendRedirect("resultnew1.jsp");
               //RequestDispatcher rd=request.getRequestDispatcher("/result.jsp");
               //rd.forward(request, response);
              
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
        processRequest(req,resp);
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
