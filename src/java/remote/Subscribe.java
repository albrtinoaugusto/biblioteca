
package remote;

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/subscribe")
public class Subscribe extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        User user = new User(0, request.getParameter("name"), request.getParameter("surname"), request.getParameter("email"), request.getParameter("password"), Integer.parseInt(request.getParameter("type")));
        if (new UserDAO().writeUser(user) == true)
        {
            request.setAttribute("back_link", "login/");
            request.setAttribute("info", "Você registou-se com sucesso!");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "confirmation");
            rd.forward(request, response);
        }
        else
        {
            request.setAttribute("back_link", "login/");
            request.setAttribute("info", "Erro ao gravar os dados informados. Tente mais tarde ou entre em contacto com a equipe de suporte");
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
