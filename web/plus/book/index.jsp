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

                        <form action="${pageContext.request.contextPath}/writebook" method="post" id="adminpro-form" class="adminpro-form">
                            <div class="login-bg">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="custom_label" style="font-size: 12pt">
                                            <br/>
                                            <b>Adicionar Livro</b>
                                        </div>
                                    </div>
                                </div>
                                <br/>
                                <br/>

                                <div class="box-body">

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Título</label>
                                                <input type="text" class="form-control line_field" id="title_field"  name="title" placeholder="Título da Obra" maxlength="190" required/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Autor</label>
                                                <input type="text" class="form-control line_field" id="author_field" name="author" placeholder="Autor" maxlength="190" required/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Categoria</label>
                                                <select class="form-control line_field" id="category" name="category">
                                                    <option value="Obra Literária">Obra Literária</option>
                                                    <option value="Revista">Revista</option>
                                                    <option value="Jornal">Jornal</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Editora</label>
                                                <input type="text" class="form-control line_field" id="publisher_field" placeholder="Editora" name="publisher" maxlength="190" required/>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Ano de Lançamento</label>
                                                <input type="number" class="form-control line_field" id="publish_year_field" name="publish_year" placeholder="Ano de Lançamento" maxlength="2019" value="1994" required/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Manchete</label>
                                                <input type="text" class="form-control line_field" id="brand_field" name="brand" placeholder="Manchete" maxlength="190" required/>
                                            </div>
                                        </div>
                                    </div>    


                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Periodicidade</label>
                                                <input type="number" class="form-control line_field" id="time_field" name="time" placeholder="Periodicidade" min="1" max="2019" value="1" required/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Quantidade</label>
                                                <input type="number" class="form-control line_field" id="amount_field" name="amount" placeholder="Quantidade" min="1" max="2000" value="1" required/>
                                            </div>
                                        </div>
                                    </div>  


                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Corredor</label>
                                                <input type="number" class="form-control line_field" id="corredor_field" name="tunel" placeholder="Corredor" min="1" max="100" value="1" required/>
                                            </div>
                                        </div>

                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label class="custom_label">Prateleira</label>
                                                <input type="text" class="form-control line_field" id="shelf_field" name="shelf" placeholder="Quantidade" value="P1-L" required/>
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