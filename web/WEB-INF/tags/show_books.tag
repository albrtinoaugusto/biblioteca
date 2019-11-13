<%@tag import="model.Book"%>
<%@tag import="dao.BookDAO"%>
<%@tag import="java.util.List"%>

<div class="table-responsive">
    <table id="invoice-list" class="table table-hover no-wrap" data-page-size="10">
        <thead>
            <tr>
                <th>#Código</th>
                <th>Titulo</th>
                <th>Autor</th>
                <th>Categoria</th>
                <th>Editora</th>
                <th>Lançamento</th>
                <th>Quantidade</th>
                <th>Acção</th>
            </tr>
        </thead>
        <tbody>
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
                            <td><%out.print(book.getCategory());%></td>
                            <td><%out.print(book.getPublisher());%></td>
                            <td><%out.print(book.getPublishYear());%></td>
                            <td><%out.print(book.getAmount());%></td>
                            <td>
                                
                                <a href="${pageContext.request.contextPath}/editbook">
                                    <button class="btn btn-sm btn-info">
                                        <i class="fa fa-pencil"></i>
                                    </button>
                                </a>
                                    
                                <!--
                                    &nbsp; &nbsp;   
                                    <a href="$x{pageContext.request.contextPath}/deletebook">
                                        <button class="btn btn-sm btn-danger">
                                            <i class="fa fa-trash"></i>
                                        </button>
                                    </a>
                                -->
                            </td>
                        </tr>
            <%
                    }
                }
                else
                {
                    %><tr><td colspan="8"> Ainda sem livros adicionados...</td></tr><%
                }
            %>
        </tbody>
    </table>
</div>
