
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
import model.Reader;
import model.Visitor;
import services.Generator;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/writereader")

public class WriteReader extends HttpServlet
{


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        
        Reader reader = new Reader
        (
            new Generator().generateReaderKey(), 
            request.getParameter("name"), 
            request.getParameter("surname"), 
            Integer.parseInt(request.getParameter("sex")), 
            request.getParameter("born_date"), 
            request.getParameter("address"), 
            request.getParameter("doc_type"), 
            request.getParameter("num_doc"), 
            request.getParameter("born_place"), 
            request.getParameter("contact"), 
            request.getParameter("type")
        );
        
        
        if (new ReaderDAO().writeReader(reader) == true)
        {
              
            if (reader.getCategory().equals("Visitante"))
            {
                RequestDispatcher rd = request.getRequestDispatcher("/plus/reader/visitor/?code=" + reader.getReaderCode());
                rd.forward(request, response);
            }
            
            
            if (reader.getCategory().equals("Professor"))
            {
                RequestDispatcher rd = request.getRequestDispatcher("/plus/reader/professor/?code=" + reader.getReaderCode());
                rd.forward(request, response);
            }
            
            
            if (reader.getCategory().equals("Estudante"))
            {
                RequestDispatcher rd = request.getRequestDispatcher("/plus/reader/student/?code=" + reader.getReaderCode());
                rd.forward(request, response);
            }
            
        }
        else
        {
            String link = request.getRequestURL().toString().replace("writereader", "new-reader.jsp");
            
            request.setAttribute("back_link", link);
            request.setAttribute("info", "Erro ao gravar os dados informados. Tente mais tarde ou entre em contacto com a equipe de suporte");
            RequestDispatcher rd = request.getRequestDispatcher("/information/?type=" + "error");
            rd.forward(request, response);
        }
        
    }
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
