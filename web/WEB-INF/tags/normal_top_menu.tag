<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<div class="header-top-area">
    <div class="fixed-header-top">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-1 col-md-6 col-sm-6 col-xs-12">
                    <button type="button" id="sidebarCollapse" class="btn bar-button-pro header-drl-controller-btn btn-info navbar-btn">
                        <i class="fa fa-bars"></i>
                    </button>
                    <div class="admin-logo logo-wrap-pro">
                        <a href="#"><img src="${pageContext.request.contextPath}/assets/img/logo/log.png" alt="" />
                        </a>
                    </div>
                </div>
                <div class="col-lg-6 col-md-1 col-sm-1 col-xs-12">
                    <div class="header-top-menu tabl-d-n">
                        <ul class="nav navbar-nav mai-top-nav">
                            <li class="nav-item">
                                <a href="${pageContext.request.contextPath}/require/" class="nav-link">Requisitar</a>
                            </li>
                            <li class="nav-item">
                                <a href="${pageContext.request.contextPath}/handhover/" class="nav-link">Devolver</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
                                    Adicionar <span class="angle-down-topmenu"><i class="fa fa-angle-down"></i></span></a>
                                <div role="menu" class="dropdown-menu animated flipInX">
                                    <a href="${pageContext.request.contextPath}/plus/book/" class="dropdown-item">Obra</a>
                                    <a href="${pageContext.request.contextPath}/plus/reader/" class="dropdown-item">Leitor</a>
                                    <a href="${pageContext.request.contextPath}/plus/user/" class="dropdown-item">Usuário</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
                                    Listar <span class="angle-down-topmenu"><i class="fa fa-angle-down"></i></span></a>
                                <div role="menu" class="dropdown-menu animated flipInX">
                                    <a href="${pageContext.request.contextPath}/show/books/" class="dropdown-item">Obras</a>
                                    <a href="${pageContext.request.contextPath}/show/readers/" class="dropdown-item">Leitores</a>
                                    <a href="${pageContext.request.contextPath}/show/users/" class="dropdown-item">Usuários</a>
                                    <a href="${pageContext.request.contextPath}/show/requires/" class="dropdown-item">Requisições</a>
                                    <a href="${pageContext.request.contextPath}/show/devolutions/" class="dropdown-item">Devoluções</a>
                                </div>
                            </li>
                            <li class="nav-item"><a href="${pageContext.request.contextPath}/suport/" class="nav-link">Supporte</a>
                            </li>
                        </ul>
                    </div>
                </div>

                
                <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12">
                    <tags:user_settings/>
                </div>
                
            </div>
        </div>
    </div>
</div>