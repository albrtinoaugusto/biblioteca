<%@tag import="model.User"%>


<%
    RequestDispatcher requestDispatcher = null;
    
    if (request.getSession().getAttribute("user_session") == null)
    {
        requestDispatcher = request.getRequestDispatcher("/login/");
        requestDispatcher.forward(request, response);
    }
%>

