

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
        <script>
            function xyz()
            {

                var a = document.getElementById("cat").value;

                if (a === "Psu" || a === "Nkn" || a === "Others" || a === "Const")
                {
                    var elem = document.getElementById("my1");
                    elem.hidden = true;
                    var elem1 = document.getElementById("mydiv");
                    elem1.hidden = true;
                } else
                {
                    var elem = document.getElementById("my1");
                    elem.hidden = false;
                    var elem1 = document.getElementById("mydiv");
                    elem1.hidden = false;
                }
            }
            function check()
            {


            }

            $(document).ready(function ()
            {
                var check = 0;
                $('#cat').change(function () {
                    var category = document.getElementById("cat").value;
                    var select = document.getElementById("min");

                    $.ajax({
                        url: "cascading",
                        type: "post",
                        data: {cat: category, check: 0},
                        success: function (data)
                        {

                            var i;
                            for (i = select.length; i > 1; i--)
                            {
                                select.remove(i - 1);
                            }
                            for (i = 0; i < data.length; i++)
                            {

                                var option = document.createElement("option");
                                option.value = data[i];
                                option.innerHTML = data[i];
                                select.add(option);
                            }
                        },
                        error: function (data, status, er) {
                            console.log(data + "_" + status + "_" + er);
                        }
                    });
                });
                $('#min').change(function () {
                    var mini = document.getElementById("min").value;
                    var sele = document.getElementById("dep");

                    $.ajax({
                        url: "cascading",
                        type: "post",
                        data: {min: mini, check: 1},
                        success: function (data)
                        {

                            var i;
                            for (i = sele.length; i > 1; i--)
                            {
                                sele.remove(i - 1);
                            }
                            for (i = 0; i < data.length; i++)
                            {

                                var option = document.createElement("option");
                                option.value = data[i];
                                option.innerHTML = data[i];
                                sele.add(option);
                            }
                        },
                        error: function (data, status, er) {
                            console.log(data + "_" + status + "_" + er);
                        }
                    });
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
                                                        <span class="caption-subject bold uppercase"> Preview </span>
                                                    </div>
                                                    <br>
                                                    <br>
                                                    <div class="portlet-body form">
                                                        <form role="form" action="update" method="post">
                                                            <div class="form-body">

                                                                <div class="form-group">
                                                                    <div class="form-group">
                                                                        <div class="form-group">

                                                                            <label><b>Employee Category</b></label>

                                                                            <select name="empcat" id="cat" onchange="xyz()" class="form-control">
                                                                                <option value="Select a category">Select a category</option>
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
                                                                            <select name="empmin" id="min" onchange="abc('min')" class="form-control">
                                                                                <option>Select a ministry</option>


                                                                            </select>

                                                                            <br>
                                                                        </div>



                                                                        <div id="my1">

                                                                            <label><b>Employee Department</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                                                            <select name="empdep" id="dep" onchange="abc('dep')" class="form-control">
                                                                                <option value="">Select a department</option>
                                                                            </select>

                                                                        </div>
                                                                        <br>
                                                                        <br>

                                                                        <div class="row">
                                                                            <input type="submit" value="Fetch" class="btn red " style="float:right;">
                                                                        </div>

                                                                    </div>  
                                                                </div>
                                                            </div>
                                                        </form>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-md-10">

                                                        </div>
                                                        <div class="col-md-2">

                                                        </div>
                                                    </div>
                                                    <div class="portlet-body">

                                                        <table class="table table-striped table-bordered table-hover table-checkable order-column" id="sample_1">
                                                            <%

                                                                if (session.getAttribute("employee") != null) {

                                                                    ArrayList<employee> list = (ArrayList<employee>) session.getAttribute("employee");
                                                                    session.removeAttribute("employee");

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
                            </div>
                        </div>
                        <!-- END PAGE CONTENT BODY -->
                        <!-- END CONTENT BODY -->
                    </div>
                    <!-- END CONTENT -->

                </div>
                <!-- END CONTAINER -->
            </div>
        </div>


        <div class="modal fade bs-modal-lg" id="large" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        <h4 class="modal-title">Edit Application SINGLE01012017</h4>
                    </div>
                    <div class="modal-body"> 
                        <div class="portlet-body form">
                            <form role="form">
                                <div class="form-body">
                                    <div class="form-group">
                                        <label>Email Address</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">
                                                <i class="fa fa-envelope"></i>
                                            </span>
                                            <input type="text" class="form-control" placeholder="Email Address"> </div>
                                    </div>

                                    <div class="form-group">
                                        <label>Input with Icon</label>
                                        <div class="input-group input-icon right">
                                            <span class="input-group-addon">
                                                <i class="fa fa-envelope font-purple"></i>
                                            </span>
                                            <i class="fa fa-exclamation tooltips" data-original-title="Invalid email." data-container="body"></i>
                                            <input id="email" class="input-error form-control" type="text" value=""> </div>
                                    </div>

                                    <div class="form-group">
                                        <label>Disabled</label>
                                        <input type="text" class="form-control" placeholder="Disabled" disabled=""> </div>
                                    <div class="form-group">
                                        <label>Readonly</label>
                                        <input type="text" class="form-control" placeholder="Readonly" readonly=""> </div>
                                    <div class="form-group">
                                        <label>Dropdown</label>
                                        <select class="form-control">
                                            <option>Option 1</option>
                                            <option>Option 2</option>
                                            <option>Option 3</option>
                                            <option>Option 4</option>
                                            <option>Option 5</option>
                                        </select>
                                    </div>

                                    <div class="form-group">
                                        <label>Textarea</label>
                                        <textarea class="form-control" rows="3"></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputFile1">File input</label>
                                        <input type="file" id="exampleInputFile1">
                                        <p class="help-block"> some help text here. </p>
                                    </div>
                                    <div class="form-group">
                                        <label>Checkboxes</label>
                                        <div class="mt-checkbox-list">
                                            <label class="mt-checkbox"> Checkbox 1
                                                <input type="checkbox" value="1" name="test">
                                                <span></span>
                                            </label>
                                            <label class="mt-checkbox"> Checkbox 2
                                                <input type="checkbox" value="1" name="test">
                                                <span></span>
                                            </label>
                                            <label class="mt-checkbox"> Checkbox 3
                                                <input type="checkbox" value="1" name="test">
                                                <span></span>
                                            </label>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label>Outline Radios</label>
                                        <div class="mt-radio-list">
                                            <label class="mt-radio mt-radio-outline"> Radio 1
                                                <input type="radio" value="1" name="test">
                                                <span></span>
                                            </label>
                                            <label class="mt-radio mt-radio-outline"> Radio 2
                                                <input type="radio" value="1" name="test">
                                                <span></span>
                                            </label>
                                            <label class="mt-radio mt-radio-outline"> Radio 3
                                                <input type="radio" value="1" name="test">
                                                <span></span>
                                            </label>
                                        </div>
                                    </div>

                                </div>

                            </form>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn dark btn-outline" data-dismiss="modal">Close</button>
                        <button type="button" class="btn green">Save changes</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
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

