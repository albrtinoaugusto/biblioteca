
package remote;

import dao.BookDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;
import services.Generator;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/updatebook")
public class UpdateBook extends HttpServlet 
{

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        Book book = new Book
        (
            request.getParameter("code"), 
            request.getParameter("title"), 
            request.getParameter("author"), 
            request.getParameter("category"), 
            request.getParameter("publisher"), 
            Integer.parseInt(request.getParameter("publish_year")), 
            request.getParameter("brand"), 
            request.getParameter("time"), 
            Integer.parseInt(request.getParameter("amount")),
            Integer.parseInt(request.getParameter("tunel")), 
            request.getParameter("shelf")    
        );
        
        
        if (new BookDAO().updateBook(book) == true)
        {
            request.setAttribute("back_link", "show/books/");
            request.setAttribute("info", "Livro actualizado com sucesso!");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "confirmation");
            rd.forward(request, response);
        }
        else
        {
            request.setAttribute("back_link", "plus/book/");
            request.setAttribute("info", "Erro ao actualizar os dados. Tente mais tarde ou entre em contacto com a equipe de suporte");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "error");
            rd.forward(request, response);
        }
        
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        processRequest(request, response);
    }
    

    @Override
    public String getServletInfo() 
    {
        return "Short description";
    }// </editor-fold>

}
