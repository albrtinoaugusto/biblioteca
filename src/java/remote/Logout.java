
package remote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/logout")
public class Logout extends HttpServlet
{


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        
        RequestDispatcher rd = request.getRequestDispatcher("/login/");
        rd.forward(request, response);
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        
        RequestDispatcher rd = request.getRequestDispatcher("/login/");
        rd.forward(request, response);
    }

    


    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
