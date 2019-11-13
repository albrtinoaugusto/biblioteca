<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib tagdir="/WEB-INF/tags/session/" prefix="session"%>

<session:user/>

<!DOCTYPE html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Gestor de Bíblioteca</title>
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


                <!-- Static Table Start -->
                <div class="container-fluid">

                    <br/>

                    <div class="middle_forms">

                        <form action="${pageContext.request.contextPath}/subscribe" method="post" id="adminpro-form" class="adminpro-form">
                            <div class="login-bg">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="custom_label" style="font-size: 12pt">
                                            <br/>
                                            <b>Adicionar Usuário</b>
                                        </div>
                                    </div>
                                </div>
                                <br/>
                                <br/>

                                <div class="box-body">

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Nome</label>
                                                <input type="text" class="form-control line_field" placeholder="Nome" maxlength="50" name="name" required/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Apelido</label>
                                                <input type="text" class="form-control line_field" placeholder="Apelido" maxlength="100" name="surname" required/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">     
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label class="custom_label">E-mail</label>
                                                <input type="email" class="form-control line_field" placeholder="E-mail" maxlength="100" required name="email"/>
                                            </div>
                                        </div>
                                    </div>    

                                    <div class="row">  
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Senha</label>
                                                <input type="password" class="form-control line_field" placeholder="Senha" minlength="6" required name="password"/>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Repita</label>
                                                <input type="password" class="form-control line_field" placeholder="Repita" minlength="6" required name="repass"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <input type="radio" id="check1" name="type" value="1" checked>
                                            <label for="check1">Bibliotecário</label>
                                        </div>
                                    </div>

                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <input type="radio" id="check2" name="type" value="2">
                                            <label for="check2">Gestor</label>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <input type="radio" id="check3" name="type" value="3">
                                            <label for="check3">Administrador</label>
                                        </div>
                                    </div>
                                </div>


                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <input type="checkbox" id="basic_checkbox_1" required/>
                                            <label for="basic_checkbox_1">Eu aceito os <a href="#" class="text-warning"><b>Termos</b></a></label>
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-lg-6">
                                        <a href="<tags:back_link/>">
                                            <button type="button" class="do-button">Cancelar</button>
                                        </a>
                                    </div>

                                    <div class="col-lg-6">
                                        <button type="submit" class="save-button alignright">Gravar</button>
                                    </div>
                                </div>
                                            
                            </div>
                                            
                            <br/>
                        </form>  
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