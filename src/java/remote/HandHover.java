
package remote;

import dao.BookDAO;
import dao.HandOverDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.RequireDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import model.Book;
import model.Require;
import model.HandOver;
import model.User;
import services.DateTime;
import services.Generator;

/**
 *
 * @author Augusto Marrengula */

@WebServlet("/handhover")
public class HandHover extends HttpServlet
{


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String id = request.getParameter("id");
        
        Require require = new RequireDAO().getRequireByBookCode(id);
        int amount = require.getAmount();
        
        Book book = new BookDAO().getBookByID(require.getBookCode());
        
        if (new BookDAO().increaseAmount(book.getBookCode(), amount))
        {
            
            User user = (User) request.getSession().getAttribute("user_session");
            
            DateTime dt = new DateTime();
            
            HandOver handOver = new HandOver
            (
                new Generator().generateHandOverKey(),
                require.getReaderCode(),
                require.getBookCode(),
                user.getUserId(),
                require.getRequireCode(),
                require.getRequireType(),
                dt.getTimeWithMinutes(),
                dt.getDateDash()    
            );
            
            if (new HandOverDAO().writeAndOver(handOver))
            {
                request.setAttribute("back_link", "show/requires/");
                request.setAttribute("info", "Devolução efectuada com sucesso!.");
                RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "confirmation");
                rd.forward(request, response);
            }
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
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
