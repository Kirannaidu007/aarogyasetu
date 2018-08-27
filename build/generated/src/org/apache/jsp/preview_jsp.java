package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.employee;

public final class preview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <title>update</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link href=\"css/jquery-ui.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery-1.11.2.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function xyz()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                var a = document.getElementById(\"cat\").value;\n");
      out.write("\n");
      out.write("                if (a === \"Psu\" || a === \"Nkn\" || a === \"Others\" || a === \"Const\")\n");
      out.write("                {\n");
      out.write("                    var elem = document.getElementById(\"my1\");\n");
      out.write("                    elem.hidden=true;\n");
      out.write("                     var elem1 = document.getElementById(\"mydiv\");\n");
      out.write("                     elem1.hidden=true;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    var elem= document.getElementById(\"my1\");\n");
      out.write("                    elem.hidden=false;\n");
      out.write("                     var elem1 = document.getElementById(\"mydiv\");\n");
      out.write("                     elem1.hidden=false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("               \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).ready(function ()\n");
      out.write("            {\n");
      out.write("                var check = 0;\n");
      out.write("                $('#cat').change(function () {\n");
      out.write("                    var category = document.getElementById(\"cat\").value;\n");
      out.write("                    var select = document.getElementById(\"min\");\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"cascading\",\n");
      out.write("                        type: \"post\",\n");
      out.write("                        data: {cat: category, check: 0},\n");
      out.write("                        success: function (data)\n");
      out.write("                        {\n");
      out.write("\n");
      out.write("                            var i;\n");
      out.write("                            for (i = select.length; i > 1; i--)\n");
      out.write("                            {\n");
      out.write("                                select.remove(i - 1);\n");
      out.write("                            }\n");
      out.write("                            for (i = 0; i < data.length; i++)\n");
      out.write("                            {\n");
      out.write("\n");
      out.write("                                var option = document.createElement(\"option\");\n");
      out.write("                                option.value = data[i];\n");
      out.write("                                option.innerHTML = data[i];\n");
      out.write("                                select.add(option);\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function (data, status, er) {\n");
      out.write("                            console.log(data + \"_\" + status + \"_\" + er);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                $('#min').change(function () {\n");
      out.write("                    var mini = document.getElementById(\"min\").value;\n");
      out.write("                    var sele = document.getElementById(\"dep\");\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"cascading\",\n");
      out.write("                        type: \"post\",\n");
      out.write("                        data: {min: mini, check: 1},\n");
      out.write("                        success: function (data)\n");
      out.write("                        {\n");
      out.write("\n");
      out.write("                            var i;\n");
      out.write("                            for (i = sele.length; i > 1; i--)\n");
      out.write("                            {\n");
      out.write("                                sele.remove(i - 1);\n");
      out.write("                            }\n");
      out.write("                            for (i = 0; i < data.length; i++)\n");
      out.write("                            {\n");
      out.write("\n");
      out.write("                                var option = document.createElement(\"option\");\n");
      out.write("                                option.value = data[i];\n");
      out.write("                                option.innerHTML = data[i];\n");
      out.write("                                sele.add(option);\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function (data, status, er) {\n");
      out.write("                            console.log(data + \"_\" + status + \"_\" + er);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"update\" method=\"post\">  \n");
      out.write("            <div><h1>Preview</h1></div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label><b>Employee Category :</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <select name=\"empcat\" id=\"cat\" onchange=\"xyz()\" required=\"\">\n");
      out.write("                <option value=\"\">Select a Category</option>\n");
      out.write("                <option  value=\"Central\">Central</option>\n");
      out.write("                <option value=\"State\">State</option>\n");
      out.write("                <option value=\"Psu\">Psu</option>\n");
      out.write("                <option value=\"Nkn\">Nkn</option>\n");
      out.write("                <option value=\"Others\">Others</option>\n");
      out.write("                <option value=\"Const\">Const</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <label><b>Employee Ministry :</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <select name=\"empmin\" id=\"min\" required>\n");
      out.write("                <option>Select a ministry</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div id=\"my1\">\n");
      out.write("                <label><b>Employee Department :</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("                <select name=\"empdep\" id=\"dep\" >\n");
      out.write("                    <option value=\" \">Select a department</option>\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" id=\"fetch\" name=\"btn\" value=\"Fetch Your Existing Details\" onclick=\"check()\">\n");
      out.write("            ");

                String cat = request.getParameter("empcat");
                String dept = request.getParameter("empdep");
                String min = request.getParameter("empmin");
                session.setAttribute("empcat", cat);
                session.setAttribute("empdep", dept);
                session.setAttribute("empmin", min);

            
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"upd\">\n");
      out.write("                <table>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                \n");
      out.write("                    ");
          
                        
                        
                        
                        if (session.getAttribute("employee") != null){
                    
                            ArrayList<employee> list = (ArrayList<employee>) session.getAttribute("employee");
                            session.removeAttribute("employee");
                            
                        
      out.write("\n");
      out.write("                         <tr>\n");
      out.write("                        <th colspan=\"8\" style=\"background-color:lightskyblue;\">Employee records</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr style=\"background-color:#f0a64e;\">\n");
      out.write("                        <th class=\"border\">Employee ID</th>\n");
      out.write("                        <th class=\"border\">Employee Category</th>\n");
      out.write("                        <th class=\"border\">Employee Ministry</th>\n");
      out.write("                        <th class=\"border\">Employee Department</th>\n");
      out.write("                        <th class=\"border\">Employee Domain</th>\n");
      out.write("                        <th class=\"border\">Employee Coordinator Name</th>\n");
      out.write("                        <th class=\"border\">Employee Coordinator Email</th>\n");
      out.write("                        <th class=\"border\">Employee Admin Email</th>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                        ");

                            for (int i = 0; i < list.size(); i++) {
                                employee user = new employee();
                                user = list.get(i);

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getCat());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getMin());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getDep());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getDom());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getCoor());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getCmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( user.getAmail());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                            }
                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
