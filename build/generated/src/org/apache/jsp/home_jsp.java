package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Autocomplete Search</title>\n");
      out.write("        <link href=\"css/jquery-ui.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery-1.11.2.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#tags\").on('keyup change',function () {\n");
      out.write("                    \n");
      out.write("                    var str = document.getElementById(\"tags\").value;\n");
      out.write("                    \n");
      out.write("                    $.ajax({\n");
      out.write("\n");
      out.write("                        url: \"Auto\",\n");
      out.write("                        type: \"post\",\n");
      out.write("                        data: {tags: str},\n");
      out.write("                       // console.log('DATA: '+ str)\n");
      out.write("                        success: function (data) {\n");
      out.write("                            $(\"#tags\").autocomplete({\n");
      out.write("                                source: data\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        error: function (data, status, er) {\n");
      out.write("                            console.log(data + \"_\" + status + \"_\" + er);\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                });\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                    });\n");
      out.write("\n");
      out.write("             \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <form action=\"display\" method=\"POST\">\n");
      out.write("        <div class=\"ui-widget\">\n");
      out.write("            <label for=\"tags\">EMAIL </label>\n");
      out.write("            <input type=\"text\" id=\"tags\" name=\"tags\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"ui-widget\">\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <button value=\"Submit\" class=\"ui-button\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("            </html>\n");
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
