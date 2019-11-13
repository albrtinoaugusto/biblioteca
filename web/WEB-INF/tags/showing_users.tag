<%@tag import="model.User"%>
<%@tag import="dao.UserDAO"%>
<%@tag import="java.util.List"%>

<%
    
    
    List<User> users = new UserDAO().getUsers();
    int count = new UserDAO().countUsers();
    
    if (users.size() > 0)
    {
        for (User user: users)
        {
%>
            <tr>
                <td><%out.print(user.getUserId());%></td>
                <td><%out.print(user.getName());%></td>
                <td><%out.print(user.getSurname());%></td>
                <td><%out.print(user.getUsername());%></td>
                <td>
                    <%
                        if (user.getNivel() == 1)
                        {
                            out.print("Bibliotecário");
                        }
                        else if (user.getNivel() == 2)
                        {
                            out.print("Admistrador");
                        }
                        else
                        {
                            out.print("Root");
                        }
                    %>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/deleteuser?id=<%out.print(user.getUserId());%>">
                        <button class="save-button-small btn-sm"> 
                            <i class="fa fa-trash"></i>
                        </button>
                    </a>
                </td>
            </tr>                                    
<%
        }
%>
            <td colspan="6"> 
                Total: <%out.print(count);%>    
            </td>
<%
    }
    else
    {
        %><tr><td colspan="6"> Sem dados a mostrar...</td></tr><%
    }
%>
