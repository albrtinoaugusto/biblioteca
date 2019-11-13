<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib tagdir="/WEB-INF/tags/session/" prefix="session"%>

<session:user/>

<!DOCTYPE html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Gestor de Bíblioteca | Usuários</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/img/favicon.ico">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/adminpro-custon-icon.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/meanmenu.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/animate.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/normalize.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/responsive.css">
        <script src="${pageContext.request.contextPath}/assets/js/vendor/modernizr-2.8.3.min.js"></script>
        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main_style.css">
    </head>


    <body class="materialdesign">
        <div class="wrapper-pro">

            <tags:left_side_bar/>

            <div class="content-inner-all">

                <tags:normal_top_menu/>


                <div class="breadcome-area mg-b-30 small-dn">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="breadcome-list shadow-reset">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <span class="bread-blod">Sitema de Gestão de Bíblioteca | Usuários</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <!-- Mobile Menu start -->
                <tags:mobile_menu/>
                <!-- Mobile Menu end -->


                <!-- Breadcome start-->
                <div class="breadcome-area mg-b-30 des-none">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="breadcome-list map-mg-t-40-gl shadow-reset">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <span class="bread-blod">Sitema de Gestão de Bíblioteca | Usuários</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Breadcome End-->


                <!-- Static Table Start -->
                <div class="static-table-area mg-b-15">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="sparkline8-list shadow-reset">
                                    <div class="sparkline8-hd">
                                        <div class="main-sparkline8-hd">
                                            <h1>Usuários</h1>
                                            <div class="sparkline8-outline-icon">
                                                <span class="sparkline8-collapse-link"><i class="fa fa-chevron-up"></i></span>
                                                <span class="sparkline8-collapse-close"><i class="fa fa-times"></i></span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="sparkline8-graph">
                                        <div class="static-table-list">
                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th>#ID</th>
                                                        <th>Nome</th>
                                                        <th>Apelido</th>
                                                        <th>E-mail</th>
                                                        <th>Tipo</th>
                                                        <th>Acção</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tags:showing_users/>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                                                
            </div>
        </div>



        <!-- Footer Start-->
        <div class="footer-copyright-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer-copy-right">
                            <p>Copyright &#169; 
                                <script>
                                    document.write(new Date().getFullYear());
                                </script>    
                                Albino Libombo & Albertino Augusto.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        
        <script src="${pageContext.request.contextPath}/assets/js/vendor/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.meanmenu.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.sticky.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.scrollUp.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/counterup/jquery.counterup.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/counterup/waypoints.min.js"></script>

        <script src="${pageContext.request.contextPath}/assets/js/dropzone.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
    </body>

</html>