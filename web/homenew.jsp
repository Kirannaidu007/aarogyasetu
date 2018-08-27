<%-- 
    Document   : homenew
    Created on : 15 Jun, 2018, 12:08:17 PM
    Author     : AAKRITI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8" />
        <title>@Gov.in | Support,Component Authority,Mail-Admin | Online Forms</title> 
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <link href="css/jquery-ui.css" rel="stylesheet">
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

        <script src="js/jquery-1.11.2.js"></script>
        <script src="js/jquery-ui.js"></script>
        
         <script>

            $(function () {
                $("#tags").on('keyup change',function () {
                    
                    var str = document.getElementById("tags").value;
                    
                    $.ajax({

                        url: "Auto",
                        type: "post",
                        data: {tags: str},
                       // console.log('DATA: '+ str)
                        success: function (data) {
                            $("#tags").autocomplete({
                                source: data
                            });

                        },
                        error: function (data, status, er) {
                            console.log(data + "_" + status + "_" + er);
                        }

                    });

                });
               
                
                    });

             
        </script>
    </head>
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
                                        
                                        
                                        <!-- BEGIN USER LOGIN DROPDOWN -->
                                        <li class="dropdown dropdown-user dropdown-dark">
                                        <ul class="dropdown-menu dropdown-menu-default">
                                               
                                            </ul>
                                        </li>
                                        <!-- END USER LOGIN DROPDOWN -->
                                        <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                                       
                                        <!-- END QUICK SIDEBAR TOGGLER -->
                                    </ul>
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
                                   <div class="portlet-body form">
                                    <form role="form" action="display" method="post">
                                    <div class="form-body">
                                      <div class="form-group">
                                      
                                                          
                                            <div class="row">
                                                
                                                <div class="col-lg-12">
                                                   <!-- BEGIN EXAMPLE TABLE PORTLET-->
                                                <div class="portlet light ">
                                                    <div class="portlet-title">
                                                        <div class="caption font-dark">
                                                            <i class="icon-settings font-dark"></i>
                                                            <span class="caption-subject bold uppercase">Search</span>
                                                        </div>
                                                        
                                                    </div>
							<div class="row">
								<div class="col-md-10">
								<div class="form-group">
                                                                    
                                                                    
                                                                    <input type="text" id="tags" name="tags" class="form-control" placeholder="Enter Your Email Address" required> 
								</div>
								</div>
								<div class="col-md-2">
									<input type="submit" value="Search" class="btn red btn-block">
								</div>
							</div>
                                                </div>
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
                </div>
            </div>
        </div>
    </body>

</html>
