
package remote;

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/deleteuser")
public class DeleteUser extends HttpServlet 
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String idBook = request.getParameter("id");
        
        if (new UserDAO().deleteUser(idBook) == true)
        {
            request.setAttribute("back_link", "show/users/");
            request.setAttribute("info", "Usuário eliminado com sucesso!");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "confirmation");
            rd.forward(request, response);
        }
        else
        {
            request.setAttribute("back_link", "show/users/");
            request.setAttribute("info", "Erro ao eliminar Usuário. Tente mais tarde ou entre em contacto com a equipe de suporte");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "error");
            rd.forward(request, response);
        }
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
