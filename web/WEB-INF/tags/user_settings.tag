<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<div class="header-right-info">
    <ul class="nav navbar-nav mai-top-nav header-right-menu">
        <li class="nav-item"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle"><i class="fa fa-bell-o" aria-hidden="true"></i><span class="indicator-nt"></span></a>
            <div role="menu" class="notification-author dropdown-menu animated flipInX">
                <div class="notification-single-top">
                    <h1>Notificações</h1>
                </div>
                <ul class="notification-menu">
                    <li>
                        <a href="#">
                            <div class="notification-icon">
                                <span class="adminpro-icon adminpro-checked-pro"></span>
                            </div>
                            <div class="notification-content">
                                <span class="notification-date">11 Sept</span>
                                <h2>Informação</h2>
                                <p>Livro novo adicionado por Albino Libombo.</p>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <div class="notification-icon">
                                <span class="adminpro-icon adminpro-cloud-computing-down"></span>
                            </div>
                            <div class="notification-content">
                                <span class="notification-date">10 Sept</span>
                                <h2>Informação</h2>
                                <p>Livro novo adicionado por Albino Libombo.</p>
                            </div>
                        </a>
                    </li>
                </ul>
                <div class="notification-view">
                    <a href="#">Ver todas Informações</a>
                </div>
            </div>
        </li>
        <li class="nav-item">
            <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
                <span class="adminpro-icon adminpro-user-rounded header-riht-inf"></span>
                <span class="admin-name"><tags:show_username/></span>
                <span class="author-project-icon adminpro-icon adminpro-down-arrow"></span>
            </a>
            <ul role="menu" class="dropdown-header-top author-log dropdown-menu animated flipInX">
                <li>
                    <a href="${pageContext.request.contextPath}/user/acount/">
                        <span class="adminpro-icon adminpro-home-admin author-log-ic"></span>Minha Conta
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/user/profile/">
                        <span class="adminpro-icon adminpro-user-rounded author-log-ic"></span>Meu Perfil
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/logout">
                        <span class="adminpro-icon adminpro-locked author-log-ic"></span>Sair
                    </a>
                </li>
            </ul>
        </li>

    </ul>
</div>
