<%@tag import="model.Book"%>
<%@tag import="dao.BookDAO"%>
<%@tag import="java.util.List"%>

<%
    List<Book> books = new BookDAO().getBooks();

    if (books.size() > 0)
    {
        for (Book book : books)
        {
%>
            <tr>
                <td><%out.print(book.getBookCode());%></td>
                <td><%out.print(book.getTittle());%></td>
                <td><%out.print(book.getAuthor());%></td>
                <td><%out.print(book.getPublishYear());%></td>
                <td><%out.print(book.getAmount());%></td>
                <td>
                    <a href="${pageContext.request.contextPath}/require/?id=<%out.print(book.getBookCode());%>">
                        <button class="save-button-small btn-sm"> Requisitar </button>
                    </a>
                </td>
            </tr>                                    
<%
        }
    }
    else
    {
        %><tr><td colspan="6"> Ainda sem livros adicionados...</td></tr><%
    }
%>
