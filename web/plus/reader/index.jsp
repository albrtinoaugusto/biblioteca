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

                        <form action="${pageContext.request.contextPath}/writereader" method="post" id="adminpro-form" class="adminpro-form">
                            <div class="login-bg">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="custom_label" style="font-size: 12pt">
                                            <br/>
                                            <b>Adicionar Leitor</b>
                                        </div>
                                    </div>
                                </div>
                                <br/>
                                <br/>

                                <div class="box-body">
                                    <div class="row clearfix">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="name_field">Name</label>
                                                <input type="text" class="form-control" id="name_field"  name="name" placeholder="Nome" maxlength="50" required/>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="surname_field">Apelido</label>
                                                <input type="text" class="form-control" id="author_field" name="surname" placeholder="Apelido" maxlength="90" required/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row clearfix">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="sex">Sexo</label>
                                                <select class="form-control" id="sex" name="sex">
                                                    <option value="0">Masculino</option>
                                                    <option value="1">Femenino</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="born_date_field">Data de Nascimento</label>
                                                <input type="date" class="form-control" id="born_date_field" placeholder="Date de Nasciento" name="born_date" value="2001-01-01" required/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row clearfix">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label for="address_field">Endereço</label>
                                                <input type="text" class="form-control" id="address_field" name="address" placeholder="Endereço" maxlength="100" required/>
                                            </div>
                                        </div>
                                    </div>    


                                    <div class="row clearfix">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="doc_type" name="doc_type">Tipo de Documento</label>
                                                <select class="form-control" id="doc_type">
                                                    <option>BI</option>
                                                    <option>Passaporte</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="num_doc_field">Número do Documento</label>
                                                <input type="text" class="form-control" id="num_doc_field" name="num_doc" placeholder="" maxlength="50" required/>
                                            </div>
                                        </div>
                                    </div>    


                                    <div class="row clearfix">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="born_place_field">Naturalidade</label>
                                                <input type="text" class="form-control" id="born_place_field" name="born_place" placeholder="Naturalidade" maxlength="200" required/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="amount_field">Contacto</label>
                                                <input type="text" class="form-control" id="amount_field" name="contact" placeholder="(+258) 8X 123 456 7" maxlength="30" required/>
                                            </div>
                                        </div>
                                    </div>    


                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <input type="radio" id="check1" name="type" value="Visitante" checked>
                                                <label for="check1">Visitante</label>
                                            </div>
                                        </div>    
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <input type="radio" id="check2" name="type" value="Professor">
                                                <label for="check2">Professor</label>
                                            </div>
                                        </div>    
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <input type="radio" id="check3" name="type" value="Estudante">
                                                <label for="check3">Estudante</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <br/>
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
                        </form>              

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