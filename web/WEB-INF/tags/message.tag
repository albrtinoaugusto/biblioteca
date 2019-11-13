<%@tag body-content="empty" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
    <c:when test="${message != null}">
        ${message}
    </c:when>
    <c:otherwise>
        Entre com usuário e senha.
    </c:otherwise>
</c:choose>
