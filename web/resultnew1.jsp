<%-- 
    Document   : previewnew
    Created on : 14 Jun, 2018, 4:06:39 PM
    Author     : AAKRITI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="model.employee" %>


<!DOCTYPE html>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->

    <head>
        <meta charset="utf-8" />
        <title>@Gov.in | Support,Component Authority,Mail-Admin | Online Forms</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/components.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="assets/css/search.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/blog.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/layout.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/default.min.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="css/jquery-ui.css" rel="stylesheet">
        <script src="js/jquery-1.11.2.js"></script>
        <script src="js/jquery-ui.js"></script>
         <script src="js/changejs.js"></script>
        <link href="css/newcss.css"  rel="stylesheet">

         <script src="js/jquery-ui.js"></script>   
       <script>
    $(document).ready(function ()
    {
       
        $(".but").click(function ()
        {
           var modal = document.getElementById("large");
           var arr = [];
           
           var i;
            var $item = $(this).closest("tr");
            var $tds = $item.find("td");

            $.each($tds, function ()
            {
                arr.push($(this).text());

            });
            
                document.getElementById("cat").value=arr[1];
                var o = document.createElement('option');
                o.value = arr[2];
                o.innerHTML = arr[2];
                var x=document.getElementById("min");
                x.add(o);
                o.selected=true;
                var op1 = document.createElement('option');
                op1.value = arr[3];
                op1.innerHTML = arr[3];
                var y=document.getElementById("dep");
                y.add(op1);
                op1.selected=true;
                
               
                document.getElementById("dom").value=arr[4];
                document.getElementById("empname").value=arr[5];
                document.getElementById("cemail").value=arr[6];
                document.getElementById("aemail").value=arr[7];
                document.getElementById("update2").value=arr[0];
                document.getElementById("del").value=arr[0];
                
                
      
        });
    });

        
</script>




    </head>
    <!-- END HEAD -->

    <body class="page-container-bg-solid">
        <div class="page-wrapper">
            <div class="page-wrapper-row">
                <div class="page-wrapper-top">
                    <!-- BEGIN HEADER -->
                    <div class="page-header">
                        <!-- BEGIN HEADER TOP -->
                        <div class="page-header-top">
                            <div class="container">
                                <!-- BEGIN LOGO -->
                                <div class="page-logo">
                                    <a href="index.html">
                                        <img src="assets/img/mail-logo-small.png" alt="logo" class="logo-default">
                                    </a>
                                </div>
                                <!-- END LOGO -->
                                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                                <a href="javascript:;" class="menu-toggler"></a>
                                <!-- END RESPONSIVE MENU TOGGLER -->
                                <!-- BEGIN TOP NAVIGATION MENU -->
                                <div class="top-menu">
                                    <ul class="nav navbar-nav pull-right">

                                    </ul>

                                    <!-- END USER LOGIN DROPDOWN -->
                                    <!-- BEGIN QUICK SIDEBAR TOGGLER -->

                                    <!-- END QUICK SIDEBAR TOGGLER -->

                                </div>
                                <!-- END TOP NAVIGATION MENU -->
                            </div>
                        </div>
                        <!-- END HEADER TOP -->

                    </div>
                    <!-- END HEADER -->
                </div>
            </div>
            <div class="page-wrapper-row full-height">
                <div class="page-wrapper-middle">
                    <!-- BEGIN CONTAINER -->
                    <div class="page-container">
                        <!-- BEGIN CONTENT -->
                        <div class="page-content-wrapper">
                            <!-- BEGIN CONTENT BODY -->
                            <!-- BEGIN PAGE HEAD-->
                            <div class="page-head">
                                <div class="container">
                                    <!-- BEGIN PAGE TITLE -->
                                    <div class="page-title">
                                        <h1>Support
                                            <small>Admin Panel</small>
                                        </h1>
                                    </div>
                                    <!-- END PAGE TITLE -->
                                    <!-- BEGIN PAGE TOOLBAR -->
                                    <div class="page-toolbar">

                                    </div>
                                    <!-- END PAGE TOOLBAR -->
                                </div>
                            </div>
                            <!-- END PAGE HEAD-->
                            <!-- BEGIN PAGE CONTENT BODY -->
                            <div class="page-content">
                                <div class="container">
                                    <!-- BEGIN PAGE BREADCRUMBS -->
                                    <ul class="page-breadcrumb breadcrumb">
                                        <li>
                                            <a href="index.html">Online Forms</a>
                                            <i class="fa fa-circle"></i>
                                        </li>
                                        <li>
                                            <span>Support Admin Console</span>
                                        </li>
                                    </ul>
                                    <!-- END PAGE BREADCRUMBS -->
                                    
                                    <div class="row">

                                        <div class="col-lg-12">
                                            <!-- BEGIN EXAMPLE TABLE PORTLET-->
                                            <div class="portlet light ">
                                                <div class="portlet-title">
                                                    <div class="caption font-dark">
                                                        <i class="icon-settings font-dark"></i>
                                                        <span class="caption-subject bold uppercase">Records:</span>
                                                    </div>
                                                    <br>
                                                    <br>
                                                   
                                                    <div class="row">
                                                        <div class="col-md-10">

                                                        </div>
                                                        <div class="col-md-2">

                                                        </div>
                                                    </div>
                                                    <div class="portlet-body">

                                                        <table class="table table-striped table-bordered table-hover table-checkable order-column" id="sample_1">
                                                            <%

                                                                if (session.getAttribute("list") != null) {

                                                                    ArrayList<employee> list = (ArrayList<employee>) session.getAttribute("list");
                                                                    session.removeAttribute("list");

                                                            %>
                                                            <thead>
                                                                <tr>

                                                                    <th> Employee Id </th>
                                                                    <th> Employee Category </th>
                                                                    <th> Employee Ministry</th>
                                                                    <th> Employee Department </th>
                                                                    <th> Employee Domain</th>
                                                                    <th> Employee Coordinator Name </th>
                                                                    <th> Employee Coordinator email </th>
                                                                    <th> Employee Admin email </th>
                                                                    <th>Update</th>
                                                                    <th>Delete</th>
                                                                </tr>
                                                            </thead>
                                                            <%  for (int i = 0; i < list.size(); i++) {
                                                                    employee user = new employee();
                                                                    user = list.get(i);

                                                            %>
                                                            <tbody>
                                                                <tr class="odd gradeX">
                                                                    <td><%= user.getId()%></td>
                                                                    <td><%= user.getCat()%></td>
                                                                    <td><%= user.getMin()%></td>
                                                                    <td><%= user.getDep()%></td>
                                                                    <td><%= user.getDom()%></td>
                                                                    <td><%= user.getCoor()%></td>
                                                                    <td><%= user.getCmail()%></td>
                                                                    <td><%= user.getAmail()%></td>
                                                                    <td>
                                                                        <div class="btn-group">
                                                                        <a  data-toggle="modal" href="#large"><button class="btn btn-info but"  type="button" >Update</button></a>
                                                                        </div>
                                                                    </td>
                                                                    <td>
                                                                        <form action="delete" method="post">
                                                                        <div class="btn-group">
                                                                            <button type="submit" class="btn btn-info" value="<%=user.getId()%>" name="but">Delete</button>
                                                                        </div>
                                                                        </form>
                                                                    </td>

                                                                </tr>

                                                            </tbody>
                                                            <%
                                                                    }
                                                                }
                                                            %>
                                                        </table>
                                                    </div>
                                                </div>
                                                <!-- END EXAMPLE TABLE PORTLET-->
                                            </div>
                                        </div>
                                    </div>
                                    
                                </div>
                                <!-- END PAGE CONTENT INNER -->
                            
                        
                       
                        <!-- END PAGE CONTENT BODY -->
                        <!-- END CONTENT BODY -->
                    
                    <!-- END CONTENT -->

                </div>
                <!-- END CONTAINER -->
            </div>
        </div>
                </div>
            </div>
        </div>
        <div class="modal fade bs-modal-lg" id="small" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            </div>
                    <div class="modal-body"> 
                        <div class="portlet-body form">
                            <form role="form" action="change" method="post">
                                <div class="form-body">
                                     <div class="form-group">
                                                                <div class="form-group">
                                                                    <div class="form-group">
                                                                        <label><b>Employee Id</b></label>
                                                                        
                                                                    </div>
                                                                </div>
                                     </div>
                                </div>
                               
                                </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade bs-modal-lg" id="large" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            </div>
                    <div class="modal-body"> 
                        <div class="portlet-body form">
                            <form role="form" action="change" method="post">
                                <div class="form-body">
                                     <div class="form-group">
                                                                <div class="form-group">
                                                                    <div class="form-group">
                                                                        <label><b>Employee Category</b></label>

                                                                        <select name="empcat" id="cat" onchange="xyz()" class="form-control" required>
                                                                            <option value="" disabled selected>Select a category</option>
                                                                            <option  value="Central">Central</option>
                                                                            <option value="State">State</option>
                                                                            <option value="Psu">Psu</option>
                                                                            <option value="Nkn">Nkn</option>
                                                                            <option value="Others">Others</option>
                                                                            <option value="Const">Const</option>
                                                                        </select>


                                                                    </div>
                                                                    <div id="yo">
                                                                        <label><b>Employee Ministry</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                                        <select name="empmin" id="min" onchange="abc('min')" class="form-control" required>
                                                                            <option value="" disabled selected>Select a ministry</option>


                                                                        </select>

                                                                        <br>
                                                                    </div>
                                                                    <div id="newdiv">

                                                                    </div>

                                          
                                                                    <div id="my">

                                                                        <label><b>Employee Department</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                                                        <select name="empdep"  id="dep" onchange="abc('dep')" class="form-control">
                                                                            <option value="">Select a department </option>
                                                                        </select>

                                                                    </div>
                                                                    <div id="mydiv">

                                                                    </div>
                                                                    <br>
                                                                     <div class="form-group">
                                                                         <label><b>Enter your Domain</b></label>
                                                                         <input type="text" class="form-control" pattern="[a-zA-Z0-9][a-zA-Z0-9-]{1,61}[a-zA-Z0-9](?:\.[a-zA-Z]{2,})+"placeholder="Enter your domain" name="dom" id="dom" required="Domain name is required"> 
                                                                      </div>
                                                                    <br>
                                                                      <div class="form-group">
                                                                          <label><b>Enter Coordinator Name</b></label>
                                                                        <input type="text" class="form-control" placeholder="Enter Coordinator Name"  id="empname" name="empcoor" required> 
                                                                      </div>
                                                                    <br>
                                                                     <div class="form-group">
                                                                         <label><b>Enter Coordinator Mail</b></label>
                                                                        <input type="email" class="form-control" placeholder="Enter Coordinator Mail" id="cemail" name="cemail" required> 
                                                                      </div>
                                                                    <br>
                                                                     <div class="form-group">
                                                                         <label><b>Enter Admin Mail</b></label>
                                                                        <input type="email" class="form-control" placeholder="Enter Admin Mail" id="aemail" name="aemail"> 
                                                                      </div>
                                                                     



                                                                    <div class="row">
                                                                        <button type="submit"  id="update2" name="update2" class="btn green">Save Changes</button>
                   
                                                                         </div>

                                                                </div>

                                                               
                                                    
                                                            </div>
                                                          
                                                        </div>
                                                     </form>    <!-- END EXAMPLE TABLE PORTLET-->
                                                </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn dark btn-outline" data-dismiss="modal">Close</button>
                        
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        
        <div class="page-wrapper-row">
            <div class="page-wrapper-bottom">
                <!-- BEGIN FOOTER -->
                <!-- BEGIN PRE-FOOTER -->
                <div class="page-prefooter">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-2 col-sm-6 col-xs-12 footer-block">
                                <a href="#"><img src="assets/img/footer/india_gov_logo.png" style="height:40px;"></a>
                            </div>
                            <div class="col-md-2 col-sm-6 col-xs-12 footer-block">
                                <a href="#"><img src="assets/img/footer/nkn-small.png" style="height:40px;"></a>
                            </div>
                            <div class="col-md-2 col-sm-6 col-xs-12 footer-block">
                                <a href="#"><img src="assets/img/footer/meity_logo.png" style="height:40px;"></a>
                            </div>
                            <div class="col-md-2 col-sm-6 col-xs-12 footer-block">
                                <a href="#"><img src="assets/img/footer/digital_india_logo.png" style="height:40px;"></a>
                            </div>
                            <div class="col-md-2 col-sm-6 col-xs-12 footer-block">
                                <a href="#"><img src="assets/img/footer/eGreetings_small.png" style="height:40px;"></a>
                            </div>
                            <div class="col-md-2 col-sm-6 col-xs-12 footer-block">
                                <a href="#"><img src="assets/img/footer/esampark.png" style="height:40px;"></a>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- END PRE-FOOTER -->
                <!-- BEGIN INNER FOOTER -->
                <div class="page-footer">
                    <div class="container"> 2017 &copy; <a target="_blank" href="http://nic.in">National Informatics Center  </a>

                    </div>
                </div>
                <div class="scroll-to-top">
                    <i class="icon-arrow-up"></i>
                </div>
                <!-- END INNER FOOTER -->
                <!-- END FOOTER -->
            </div>
        </div>
    </div>

    <!--[if lt IE 9]>
<script src="assets/plugins/respond.min.js"></script>
<script src="assets/plugins/excanvas.min.js"></script> 
<script src="assets/plugins/ie8.fix.min.js"></script> 
<![endif]-->
    <script src="assets/plugins/jquery.min.js" type="text/javascript"></script>
    <script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <script src="assets/scripts/datatable.js" type="text/javascript"></script>
    <script src="assets/plugins/datatables/datatables.min.js" type="text/javascript"></script>
    <script src="assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>
    <script src="assets/scripts/app.min.js" type="text/javascript"></script>
 
    <script src="assets/scripts/table-datatables-managed.min.js" type="text/javascript"></script>


     
            </body>

</html>

