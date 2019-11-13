<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<!DOCTYPE html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Login</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/img/favicon.ico">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/adminpro-custon-icon.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/meanmenu.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jquery.mCustomScrollbar.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/animate.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/normalize.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/form.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/responsive.css">
        <script src="${pageContext.request.contextPath}/assets/js/vendor/modernizr-2.8.3.min.js"></script>
        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main_style.css">
        
    </head>


    <body class="materialdesign">
        <div class="wrapper-pro">

            <div class="content-inner-all">
                <div class="login-form-area mg-t-30 mg-b-40">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-4"></div>
                                <form action="${pageContext.request.contextPath}/login" method="post" id="adminpro-form" class="adminpro-form">
                                    <div class="col-lg-4" style="width: 100%; max-width: 400px; margin-left: auto; margin-right: auto; margin-top: 7%; margin-bottom: 0">
                                        <div class="login-bg">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="logo">
                                                        <a href="#"><img src="${pageContext.request.contextPath}/assets/img/logo/logo.png" alt="" />
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                            <br/>
                                            <br/>

                                            <div class="row">
                                                <div class="col-lg-12" style="margin-left: 10px;">
                                                    <label style="margin-left: 4px">E-mail</label>
                                                    <div class="login-input-area">
                                                        <input type="email" name="username" placeholder="seu@email.com" required/>
                                                        <i class="fa fa-envelope login-user" aria-hidden="true"></i>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="row">
                                                <div class="col-lg-12" style="margin-left: 10px;">
                                                    <label style="margin-left: 4px">Senha</label>
                                                    <div class="login-input-area">
                                                        <input type="password" name="password" placeholder="******" minlength="6" maxlength="50" required/>
                                                        <i class="fa fa-lock login-user"></i>
                                                    </div>
                                                </div>
                                            </div>  

                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="forgot-password" style="margin-left: 10px;">
                                                        <span><tags:message/></span>
                                                    </div>
                                                </div>
                                            </div>

                                            <br/>
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="forgot-password pull-right" style="margin-left: 15px;">
                                                        <a href="#">Esqueci a senha</a>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="row">
                                                <div class="col-lg-12" style="margin-left: 10px;">
                                                    <div class="login-button-pro">
                                                        <button type="submit" class="save-button">Iniciar Sessão</button>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </form>                    
                            <div class="col-lg-4"></div>
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
        <script src="${pageContext.request.contextPath}/assets/js/jquery.form.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.validate.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/form-active.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
    </body>

</html>
