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

                        <form action="${pageContext.request.contextPath}/requirebook" method="post" id="adminpro-form" class="adminpro-form">
                            <div class="login-bg">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="custom_label" style="font-size: 12pt">
                                            <br/>
                                            <b>Requisitar Livro</b>
                                        </div>
                                    </div>
                                </div>
                                <br/>
                                <br/>

                                <div class="box-body">

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Código do Leitor</label>
                                                <input type="text" class="form-control line_field" id="title_field"  name="reader_code" placeholder="Código do Leitor" maxlength="190" required/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Código do Livro</label>
                                                <input type="text" class="form-control line_field" id="author_field" name="book_code" placeholder="Código do Livro"  value="${param.id}" maxlength="190" required/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Tipo de Requisição</label>
                                                <select class="form-control line_field" id="require_type" name="require_type">
                                                    <option value="Normal">Normal</option>
                                                    <option value="Longa">Longa</option>
                                                    <option value="Outra">Outra</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Quantidade</label>
                                                <input type="number" class="form-control line_field" id="publisher_field" placeholder="Quantidade" name="amount" min="1" value="1" required/>
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