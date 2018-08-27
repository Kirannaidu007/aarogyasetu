package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homenew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>@Gov.in | Support,Component Authority,Mail-Admin | Online Forms</title> \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\n");
      out.write("        <meta content=\"\" name=\"description\" />\n");
      out.write("        <meta content=\"\" name=\"author\" />\n");
      out.write("        <link href=\"css/jquery-ui.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/plugins/simple-line-icons/simple-line-icons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/plugins/datatables/datatables.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/css/components.min.css\" rel=\"stylesheet\" id=\"style_components\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/css/search.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<link href=\"assets/css/blog.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/css/layout.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"assets/css/default.min.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\" />\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.11.2.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        \n");
      out.write("         <script>\n");
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
      out.write("    <body class=\"page-container-bg-solid\">\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <div class=\"page-wrapper-row\">\n");
      out.write("                <div class=\"page-wrapper-top\">\n");
      out.write("                    <!-- BEGIN HEADER -->\n");
      out.write("                    <div class=\"page-header\">\n");
      out.write("                        <!-- BEGIN HEADER TOP -->\n");
      out.write("                        <div class=\"page-header-top\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <!-- BEGIN LOGO -->\n");
      out.write("                                <div class=\"page-logo\">\n");
      out.write("                                    <a href=\"index.html\">\n");
      out.write("                                        <img src=\"assets/img/mail-logo-small.png\" alt=\"logo\" class=\"logo-default\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END LOGO -->\n");
      out.write("                                <!-- BEGIN RESPONSIVE MENU TOGGLER -->\n");
      out.write("                                <a href=\"javascript:;\" class=\"menu-toggler\"></a>\n");
      out.write("                                <!-- END RESPONSIVE MENU TOGGLER -->\n");
      out.write("                                <!-- BEGIN TOP NAVIGATION MENU -->\n");
      out.write("                                <div class=\"top-menu\">\n");
      out.write("                                    <ul class=\"nav navbar-nav pull-right\">\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <!-- BEGIN USER LOGIN DROPDOWN -->\n");
      out.write("                                        <li class=\"dropdown dropdown-user dropdown-dark\">\n");
      out.write("                                        <ul class=\"dropdown-menu dropdown-menu-default\">\n");
      out.write("                                               \n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <!-- END USER LOGIN DROPDOWN -->\n");
      out.write("                                        <!-- BEGIN QUICK SIDEBAR TOGGLER -->\n");
      out.write("                                       \n");
      out.write("                                        <!-- END QUICK SIDEBAR TOGGLER -->\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END TOP NAVIGATION MENU -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END HEADER TOP -->\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <!-- END HEADER -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"page-wrapper-row full-height\">\n");
      out.write("                <div class=\"page-wrapper-middle\">\n");
      out.write("                    <!-- BEGIN CONTAINER -->\n");
      out.write("                    <div class=\"page-container\">\n");
      out.write("                        <!-- BEGIN CONTENT -->\n");
      out.write("                        <div class=\"page-content-wrapper\">\n");
      out.write("                            <!-- BEGIN CONTENT BODY -->\n");
      out.write("                            <!-- BEGIN PAGE HEAD-->\n");
      out.write("                            <div class=\"page-head\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <!-- BEGIN PAGE TITLE -->\n");
      out.write("                                    <div class=\"page-title\">\n");
      out.write("                                        <h1>Support\n");
      out.write("                                            <small>Admin Panel</small>\n");
      out.write("                                        </h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- END PAGE TITLE -->\n");
      out.write("                                    <!-- BEGIN PAGE TOOLBAR -->\n");
      out.write("                                    <div class=\"page-toolbar\">\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- END PAGE TOOLBAR -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- END PAGE HEAD-->\n");
      out.write("                            <!-- BEGIN PAGE CONTENT BODY -->\n");
      out.write("                            <div class=\"page-content\">\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <!-- BEGIN PAGE BREADCRUMBS -->\n");
      out.write("                                    <ul class=\"page-breadcrumb breadcrumb\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"index.html\">Online Forms</a>\n");
      out.write("                                            <i class=\"fa fa-circle\"></i>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <span>Support Admin Console</span>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <!-- END PAGE BREADCRUMBS -->\n");
      out.write("                                   <div class=\"portlet-body form\">\n");
      out.write("                                    <form role=\"form\" action=\"display\" method=\"post\">\n");
      out.write("                                    <div class=\"form-body\">\n");
      out.write("                                      <div class=\"form-group\">\n");
      out.write("                                      \n");
      out.write("                                                          \n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"col-lg-12\">\n");
      out.write("                                                   <!-- BEGIN EXAMPLE TABLE PORTLET-->\n");
      out.write("                                                <div class=\"portlet light \">\n");
      out.write("                                                    <div class=\"portlet-title\">\n");
      out.write("                                                        <div class=\"caption font-dark\">\n");
      out.write("                                                            <i class=\"icon-settings font-dark\"></i>\n");
      out.write("                                                            <span class=\"caption-subject bold uppercase\">Search</span>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        \n");
      out.write("                                                    </div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                                    \n");
      out.write("                                                                    \n");
      out.write("                                                                    <input type=\"text\" id=\"tags\" name=\"tags\" class=\"form-control\" placeholder=\"Enter Your Email Address\" required> \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Search\" class=\"btn red btn-block\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </form>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
