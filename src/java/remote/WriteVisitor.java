package remote;

import dao.VisitorDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Visitor;
import services.Generator;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/writevisitor")
public class WriteVisitor extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        Visitor visitor = new Visitor
        (
            new Generator().generateVisitorKey(),
            request.getParameter("from_where"),
            request.getParameter("carrer"),
            request.getParameter("reader_code")
        );
        
        if (new VisitorDAO().writeVisitor(visitor))
        {
            request.setAttribute("back_link", "show/readers/");
            request.setAttribute("info", "Visitante gravado com sucesso!");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "confirmation");
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
