
package remote;

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Albertino Augusto */
@WebServlet("/login")

public class Login extends HttpServlet
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new UserDAO().getUser(username, password);
        
        if (user != null)
        {
            
            HttpSession session = request.getSession();
            session.setAttribute("user_session", user);
                
            RequestDispatcher rd = request.getRequestDispatcher("/");
            rd.forward(request, response);
        }
        else
        {
            request.setAttribute("message", "login incorrecto, tente denovo");
            RequestDispatcher rd = request.getRequestDispatcher("/login/");
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
