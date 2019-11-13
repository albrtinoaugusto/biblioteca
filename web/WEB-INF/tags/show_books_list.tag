<%@tag import="model.Book"%>
<%@tag import="dao.BookDAO"%>
<%@tag import="java.util.List"%>


<%
    
    List<Book> books = new BookDAO().getBooks();
    
    if (books.size() > 0)
    {
        for (Book book: books)
        {
            out.print("<option value='"+book.getBookCode()+"'> " + book.getTittle() + " </option>");
        }
    }
    else
    {
        out.print("<option> Nenhum </option>");
    }
    
%>
