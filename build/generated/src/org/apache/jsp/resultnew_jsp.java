package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.employee;

public final class resultnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>@Gov.in | Support,Component Authority,Mail-Admin | Online Forms</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\" />\n");
      out.write("        <meta content=\"\" name=\"description\" />\n");
      out.write("        <meta content=\"\" name=\"author\" />\n");
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
      out.write("        <script>\n");
      out.write("    $(document).ready(function ()\n");
      out.write("    {\n");
      out.write("        var modal = document.getElementById('id01');\n");
      out.write("        var arr = [];\n");
      out.write("        $(\".update1\").click(function ()\n");
      out.write("        {\n");
      out.write("           var i;\n");
      out.write("            modal.style.display = 'block';\n");
      out.write("            var $item = $(this).closest(\"tr\");\n");
      out.write("            var $tds = $item.find(\"td\");\n");
      out.write("\n");
      out.write("            $.each($tds, function ()\n");
      out.write("            {\n");
      out.write("                arr.push($(this).text());\n");
      out.write("\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("                document.getElementById(\"cat\").value=arr[1];\n");
      out.write("                document.getElementById(\"min\").selected=arr[2];\n");
      out.write("                document.getElementById(\"dep\").selected=arr[3];\n");
      out.write("                document.getElementById(\"dom\").value=arr[4];\n");
      out.write("                document.getElementById(\"empname\").value=arr[5];\n");
      out.write("                document.getElementById(\"cemail\").value=arr[6];\n");
      out.write("                document.getElementById(\"aemail\").value=arr[7];\n");
      out.write("                document.getElementById(\"update2\").value=arr[0];\n");
      out.write("                alert(arr[0]);\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        window.onclick = function (event) {\n");
      out.write("            if (event.target === modal) {\n");
      out.write("                modal.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("       // $(\".updatenew\").click(function ()\n");
      out.write("        //{\n");
      out.write("         //  $.ajax({\n");
      out.write("             //  url:\"change\",\n");
      out.write("             //  type:\"post\",\n");
      out.write("             //  data:{values:arr}\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <!-- END HEAD -->\n");
      out.write("\n");
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
      out.write("                                        \n");
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
      out.write("                                   \n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"col-lg-12\">\n");
      out.write("                                                   <!-- BEGIN EXAMPLE TABLE PORTLET-->\n");
      out.write("                                                <div class=\"portlet light \">\n");
      out.write("                                                    <div class=\"portlet-title\">\n");
      out.write("                                                        <div class=\"caption font-dark\">\n");
      out.write("                                                            <i class=\"icon-settings font-dark\"></i>\n");
      out.write("                                                            <span class=\"caption-subject bold uppercase\">Records:</span>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        \n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-10\">\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    \n");
      out.write("                                                  <div class=\"portlet-body\">\n");
      out.write("\n");
      out.write("                                                        <table class=\"table table-striped table-bordered table-hover table-checkable order-column\" id=\"sample_1\">\n");
      out.write("                                                            ");


                                                                if (session.getAttribute("list") != null) {

                                                                    ArrayList<employee> list = (ArrayList<employee>) session.getAttribute("list");
                                                                    session.removeAttribute("list");

                                                            
      out.write("\n");
      out.write("                                                            <thead>\n");
      out.write("                                                                <tr class=\"odd gradeX\">\n");
      out.write("\n");
      out.write("                                                                    <th> Employee Id </th>\n");
      out.write("                                                                    <th> Employee Category </th>\n");
      out.write("                                                                    <th> Employee Ministry</th>\n");
      out.write("                                                                    <th> Employee Department </th>\n");
      out.write("                                                                    <th> Employee Domain</th>\n");
      out.write("                                                                    <th> Employee Coordinator Name </th>\n");
      out.write("                                                                    <th> Employee Coordinator email </th>\n");
      out.write("                                                                    <th> Employee Admin email </th>\n");
      out.write("\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            ");
  for (int i = 0; i < list.size(); i++) {
                                                                    employee user = new employee();
                                                                    user = list.get(i);

                                                            
      out.write("\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                <tr class=\"odd gradeX\">\n");
      out.write("                                                                    <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print( user.getCat());
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print( user.getMin());
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print( user.getDep());
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print( user.getDom());
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print( user.getCoor());
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print( user.getCmail());
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print( user.getAmail());
      out.write("</td>\n");
      out.write("                                                                     <td>\n");
      out.write("                                                                        <div class=\"btn-group\">\n");
      out.write("                                                                            <a  data-toggle=\"modal\" href=\"#large\"><button class=\"btn btn-info\" type=\"button\" >Update</button></a>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </td>\n");
      out.write("\n");
      out.write("                                                                </tr>\n");
      out.write("                                                                \n");
      out.write("                                                            </tbody>\n");
      out.write("                                                            ");

                                                                }
                                                              }
                                                           
      out.write("\n");
      out.write("                                                        </table>\n");
      out.write("                                                    </div>\n");
      out.write("                                                           \n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("             <div class=\"modal fade bs-modal-lg\" id=\"large\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("                                                            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                                                                <div class=\"modal-content\">\n");
      out.write("                                                                    <div class=\"modal-header\">\n");
      out.write("                                                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"></button>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                    <div class=\"modal-body\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"portlet-body form\">\n");
      out.write("                                                        <form role=\"form\">\n");
      out.write("                                                            <div class=\"form-body\">\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label>Email Address</label>\n");
      out.write("                                                                    <div class=\"input-group\">\n");
      out.write("                                                                        <span class=\"input-group-addon\">\n");
      out.write("                                                                            <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                                                        </span>\n");
      out.write("                                                                        <input type=\"text\" class=\"form-control\" placeholder=\"Email Address\"> </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label>Input with Icon</label>\n");
      out.write("                                                                    <div class=\"input-group input-icon right\">\n");
      out.write("                                                                        <span class=\"input-group-addon\">\n");
      out.write("                                                                            <i class=\"fa fa-envelope font-purple\"></i>\n");
      out.write("                                                                        </span>\n");
      out.write("                                                                        <i class=\"fa fa-exclamation tooltips\" data-original-title=\"Invalid email.\" data-container=\"body\"></i>\n");
      out.write("                                                                        <input id=\"email\" class=\"input-error form-control\" type=\"text\" value=\"\"> </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label>Disabled</label>\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Disabled\" disabled=\"\"> </div>\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label>Readonly</label>\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Readonly\" readonly=\"\"> </div>\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label>Dropdown</label>\n");
      out.write("                                                                    <select class=\"form-control\">\n");
      out.write("                                                                        <option>Option 1</option>\n");
      out.write("                                                                        <option>Option 2</option>\n");
      out.write("                                                                        <option>Option 3</option>\n");
      out.write("                                                                        <option>Option 4</option>\n");
      out.write("                                                                        <option>Option 5</option>\n");
      out.write("                                                                    </select>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                \n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label>Textarea</label>\n");
      out.write("                                                                    <textarea class=\"form-control\" rows=\"3\"></textarea>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group\">\n");
      out.write("                                                                    <label for=\"exampleInputFile1\">File input</label>\n");
      out.write("                                                                    <input type=\"file\" id=\"exampleInputFile1\">\n");
      out.write("                                                                    <p class=\"help-block\"> some help text here. </p>\n");
      out.write("                                                                </div>\n");
      out.write("                                                               \n");
      out.write("                                                                \n");
      out.write("                                                               \n");
      out.write("                                                            </div>\n");
      out.write("                                                            \n");
      out.write("                                                        </form>\n");
      out.write("                                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t    </div>\n");
      out.write("                                                                    <div class=\"modal-footer\">\n");
      out.write("                                                                        <button type=\"button\" class=\"btn dark btn-outline\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                                                        <button type=\"button\" class=\"btn green\">Save changes</button>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <!-- /.modal-content -->\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <!-- /.modal-dialog -->\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        \n");
      out.write("            </div>\n");
      out.write("           <div class=\"page-wrapper-row\">\n");
      out.write("            <div class=\"page-wrapper-bottom\">\n");
      out.write("                <!-- BEGIN FOOTER -->\n");
      out.write("                <!-- BEGIN PRE-FOOTER -->\n");
      out.write("                <div class=\"page-prefooter\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-12 footer-block\">\n");
      out.write("                                <a href=\"#\"><img src=\"assets/img/footer/india_gov_logo.png\" style=\"height:40px;\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-12 footer-block\">\n");
      out.write("                                <a href=\"#\"><img src=\"assets/img/footer/nkn-small.png\" style=\"height:40px;\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-12 footer-block\">\n");
      out.write("                                <a href=\"#\"><img src=\"assets/img/footer/meity_logo.png\" style=\"height:40px;\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-12 footer-block\">\n");
      out.write("                                <a href=\"#\"><img src=\"assets/img/footer/digital_india_logo.png\" style=\"height:40px;\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-12 footer-block\">\n");
      out.write("                                <a href=\"#\"><img src=\"assets/img/footer/eGreetings_small.png\" style=\"height:40px;\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-12 footer-block\">\n");
      out.write("                                <a href=\"#\"><img src=\"assets/img/footer/esampark.png\" style=\"height:40px;\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- END PRE-FOOTER -->\n");
      out.write("                <!-- BEGIN INNER FOOTER -->\n");
      out.write("                <div class=\"page-footer\">\n");
      out.write("                    <div class=\"container\"> 2017 &copy; <a target=\"_blank\" href=\"http://nic.in\">National Informatics Center  </a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"scroll-to-top\">\n");
      out.write("                    <i class=\"icon-arrow-up\"></i>\n");
      out.write("                </div>\n");
      out.write("                <!-- END INNER FOOTER -->\n");
      out.write("                <!-- END FOOTER -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("<script src=\"assets/plugins/respond.min.js\"></script>\n");
      out.write("<script src=\"assets/plugins/excanvas.min.js\"></script> \n");
      out.write("<script src=\"assets/plugins/ie8.fix.min.js\"></script> \n");
      out.write("<![endif]-->\n");
      out.write("    <script src=\"assets/plugins/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/scripts/datatable.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/datatables/datatables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/scripts/app.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/scripts/table-datatables-managed.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
