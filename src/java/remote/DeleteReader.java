
package remote;

import dao.ReaderDAO;
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
 * @author Augusto Marrengula */
@WebServlet("/deletereader")
public class DeleteReader extends HttpServlet
{


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        String idBook = request.getParameter("id");
        
        if (new ReaderDAO().deleteReader(idBook) == true)
        {
            request.setAttribute("back_link", "show/readers/");
            request.setAttribute("info", "Leitor eliminado com sucesso!");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "confirmation");
            rd.forward(request, response);
        }
        else
        {
            request.setAttribute("back_link", "show/readers/");
            request.setAttribute("info", "Erro ao eliminar Leitor. Tente mais tarde ou entre em contacto com a equipe de suporte");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "error");
            rd.forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
