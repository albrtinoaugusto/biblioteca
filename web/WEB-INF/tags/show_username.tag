
<%@tag import="model.User"%>


<%
    User user = (User) request.getSession().getAttribute("user_session");
    if (user != null)
    {
        String fullName = user.getName() + " " + user.getSurname();
        
        if (fullName.length() > 17)
        {
            out.print(fullName.substring(0, 14) + "...");
        }
        else
        {
            out.print(fullName);
        }
    }
    else
    {
        out.print("Vocé");
    }
%>

