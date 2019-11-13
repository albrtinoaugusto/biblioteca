<%@tag body-content="empty" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
    <c:when test="${back_link != null}">
        ${back_link}
    </c:when>
    <c:otherwise>
        javascript:history.go(-1)
    </c:otherwise>
</c:choose>