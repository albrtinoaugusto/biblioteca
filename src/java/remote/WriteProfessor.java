package remote;

import dao.ProfessorDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Professor;
import services.Generator;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/writeprofessor")
public class WriteProfessor extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        Professor visitor = new Professor
        (
            new Generator().generateProfessorKey(),
            request.getParameter("subject"),
            request.getParameter("course"),
            request.getParameter("reader_code")
        );
        
        if (new ProfessorDAO().writeProfessor(visitor))
        {
            request.setAttribute("back_link", "show/readers/");
            request.setAttribute("info", "Professor gravado com sucesso!");
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
