
<%@tag import="model.User"%>


<%
    User user = (User) request.getSession().getAttribute("user_session");
    if (user != null)
    {
        int nivel = user.getNivel();
        
        if (nivel == 1)
        {
            out.print("Bibliotecário");
        }
        else if (nivel == 2)
        {
            out.print("Administrador");
        }
        else
        {
            out.print("Root");
        }
    }
    else
    {
        out.print("Vocé");
    }
%>

