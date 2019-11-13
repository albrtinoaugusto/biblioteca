<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tags"%>


<div class="left-sidebar-pro">
    <nav id="sidebar">
        <div class="sidebar-header">
            <a href="#">
                <img src="${pageContext.request.contextPath}/assets/img/message/1.jpg" alt="Avatar"/>
            </a>
                <h3><tags:show_username_only/></h3>
                <p><tags:show_username_category/></p>
            <strong>GB+</strong>
        </div>
        <div class="left-custom-menu-adp-wrap">
            <ul class="nav navbar-nav left-sidebar-menu-pro">
                <li class="nav-item">
                    <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
                        <i class="fa big-icon fa-reorder"></i> &nbsp;
                        <span class="mini-dn">Operações</span> 
                        <span class="indicator-right-menu mini-dn"><i class="fa indicator-mn fa-angle-left"></i></span></a>
                    <div role="menu" class="dropdown-menu left-menu-dropdown animated flipInX">
                        <a href="${pageContext.request.contextPath}/require/" class="dropdown-item">Requisitar</a>
                        <a href="${pageContext.request.contextPath}/handhover/" class="dropdown-item">Devolver</a>
                    </div>
                </li>
                <li class="nav-item"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
                        <i class="fa big-icon fa-plus"></i> &nbsp;
                        <span class="mini-dn">Adicionar</span> 
                        <span class="indicator-right-menu mini-dn"><i class="fa indicator-mn fa-angle-left"></i></span></a>
                    <div role="menu" class="dropdown-menu left-menu-dropdown animated flipInX">
                        <a href="${pageContext.request.contextPath}/plus/book/" class="dropdown-item">Obra</a>
                        <a href="${pageContext.request.contextPath}/plus/reader/" class="dropdown-item">Leitor</a>
                        <a href="${pageContext.request.contextPath}/plus/user/" class="dropdown-item">Usuário</a>
                    </div>
                </li>
                <li class="nav-item"><a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
                        <i class="fa big-icon fa-archive"></i> &nbsp;
                        <span class="mini-dn">Listar</span> 
                        <span class="indicator-right-menu mini-dn"><i class="fa indicator-mn fa-angle-left"></i></span></a>
                    <div role="menu" class="dropdown-menu left-menu-dropdown animated flipInX">
                        <a href="${pageContext.request.contextPath}/show/books/" class="dropdown-item">Obras</a>
                        <a href="${pageContext.request.contextPath}/show/readers/" class="dropdown-item">Leitores</a>
                        <a href="${pageContext.request.contextPath}/show/users/" class="dropdown-item">Usuários</a>
                        <a href="${pageContext.request.contextPath}/show/requires/" class="dropdown-item">Requisições</a>
                        <a href="${pageContext.request.contextPath}/show/devolutions/" class="dropdown-item">Devoluções</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
</div>
