
package remote;

import dao.ReaderDAO;
import dao.RequireDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Require;
import model.User;
import services.DateTime;
import services.Generator;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/requirebook")
public class WriteRequire extends HttpServlet
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        User user = (User) request.getSession().getAttribute("user_session");

        DateTime dt = new DateTime();
        
        Require require = new Require
        (
            new Generator().generateRequireKey(),
            request.getParameter("reader_code"),
            request.getParameter("book_code"),
            user.getUserId(),
            request.getParameter("require_type"),
            Integer.parseInt(request.getParameter("amount")),
            dt.getTimeWithMinutes(),
            dt.getDateDash()
        );
        
        
        if (new ReaderDAO().getReaderByID(require.getReaderCode()) == null)
        {
            
            request.setAttribute("back_link", "index.jsp");
            request.setAttribute("info", "Leitor não encontrado, verifique o código informado.");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "error");
            rd.forward(request, response);
        }
        else
        {
            
            if (new RequireDAO().writeRequire(require) == true)
            {
                request.setAttribute("back_link", "index.jsp");
                request.setAttribute("info", "Requisição efectuada com sucesso!");
                RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "confirmation");
                rd.forward(request, response);
            }
            else
            {
                request.setAttribute("back_link", "index.jsp");
                request.setAttribute("info", "Erro ao gravar os dados informados. Tente mais tarde ou entre em contacto com a equipe de suporte");
                RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "error");
                rd.forward(request, response);
            }
            
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
