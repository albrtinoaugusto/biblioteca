<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<%@taglib tagdir="/WEB-INF/tags/session/" prefix="session"%>

<!DOCTYPE html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>INFORMAÇÃO</title>
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
                        <%
                            String type = request.getParameter("type");
                            if (type.equals("confirmation")) 
                            {
                        %>
                                <h1 style="text-align: center; color: #F58B0F"> 
                                    <i class="fa fa-4x fa-check-circle"></i>
                                </h1>
                                <h1 style="text-align: center">SUCESSO!</h1>
                        <%
                            } 
                            else 
                            {
                        %>
                                <h1 style="text-align: center">ERRO!</h1>
                        <%
                            }
                        %>

                        <h3 style="text-align: center">
                            <tags:information/>
                            <br/>
                            <br/>
                            <a style="text-align: center" href="<tags:back_link/>">
                                <button class="btn save-button">OK</button>
                            </a>
                        </h3>
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
