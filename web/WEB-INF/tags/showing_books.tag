<%@tag import="model.Book"%>
<%@tag import="dao.BookDAO"%>
<%@tag import="java.util.List"%>

<%
    
    String numPage = request.getParameter("p");
    
    int limit = 60;
    int pageNum = 1;
    
    if (numPage != null && numPage.length() > 0)
    {
        pageNum = Integer.parseInt(numPage);
    }
    
    int offset = (pageNum * limit) - limit;
    
    List<Book> books = new BookDAO().getBooks(limit, offset);
    int count = new BookDAO().countBooks();
    
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
                    <a href="${pageContext.request.contextPath}/edit/book/?id=<%out.print(book.getBookCode());%>">
                        <button class="save-button-small btn-sm"> 
                            <i class="fa fa-pencil"></i>
                        </button>
                    </a>
                     
                    &nbsp; 
                    
                    <a href="${pageContext.request.contextPath}/deletebook?id=<%out.print(book.getBookCode());%>">
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
                <a href="${pageContext.request.contextPath}/show/books/?p=<%out.print(pageNum - 1);%>">
                    <button class="save-button-small btn-sm"> 
                        <i class="fa fa-arrow-left"></i>
                    </button>
                </a>

                &nbsp; 

                <a href="${pageContext.request.contextPath}/show/books/?p=<%out.print(pageNum + 1);%>">
                    <button class="save-button-small btn-sm"> 
                        <i class="fa fa-arrow-right"></i>
                    </button>
                </a>
                
                &nbsp;
                
                Total: <%out.print(count);%>    
            </td>
<%
    }
    else
    {
        %><tr><td colspan="6"> Sem dados a mostrar...</td></tr><%
    }
%>
