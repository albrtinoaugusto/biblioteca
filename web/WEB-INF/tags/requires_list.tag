<%@tag import="model.HandOver"%>
<%@tag import="model.Require"%>
<%@tag import="model.Reader"%>
<%@tag import="model.Book"%>
<%@tag import="dao.RequireDAO"%>
<%@tag import="dao.HandOverDAO"%>
<%@tag import="dao.ReaderDAO"%>
<%@tag import="dao.BookDAO"%>
<%@tag import="java.util.List"%>

                                                        
<%
    
    List<Require> requires = new RequireDAO().getRequires();

    if (requires.size() > 0)
    {
        for (Require require: requires)
        {
%>
            <tr>
                <td><%out.print(require.getRequireCode());%></td>
                <% 
                    Book book = new BookDAO().getBookByID(require.getBookCode());
                    
                    if (book != null)
                    {
                        %><td><%out.print(book.getTittle());%></td><%
                        %><td><%out.print(book.getAuthor());%></td><%
                    }
                
                    Reader reader = new ReaderDAO().getReaderByID(require.getReaderCode());
                    if (reader != null)
                    {
                        %><td><%out.print(reader.getName() + " " + reader.getSurname());%></td><%
                        %><td><%out.print(reader.getCategory());%></td><%
                    }
                %>
                
                <td><%out.print(require.getRequireType());%></td>
                <td><%out.print(require.getRequireDate() + " - " + require.getRequireTime());%></td>

                <%
                    HandOver handOver = new HandOverDAO().getHandOverByRequireCode(require.getRequireCode());
                    if (handOver == null)
                    {
%>
                            <td>
                                <span>
                                    <label class="badge info-message">Não Devolvido</label>
                                </span>
                            </td>
                            
                            <td>
                                <a href="${pageContext.request.contextPath}/handhover?id=<%out.print(require.getBookCode());%>">
                                    <button class="save-button-small btn-sm"> Devolver </button>
                                </a>
                            </td>
<%
                    }
                    else
                    {
%>
                        <td>
                            <span>
                                <label class="badge info-message">Devolvido</label>
                            </span>
                        </td>
                            
                        <td>
                            <a href="${pageContext.request.contextPath}/deleterequire?id=<%out.print(require.getRequireCode());%>">
                                <button class="save-button-small btn-sm"> 
                                    <i class="fa fa-trash"></i>
                                </button>
                            </a>
                        </td>
<%
                    }
                %>
                
                
            </tr>                                    
<%
        }
    }
    else
    {
        %><tr><td colspan="6"> Ainda sem livros adicionados...</td></tr><%
    }
%>
