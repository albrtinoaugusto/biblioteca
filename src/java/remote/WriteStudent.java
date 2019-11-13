package remote;

import dao.ProfessorDAO;
import dao.StudentDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;
import services.Generator;

/**
 *
 * @author Albertino Augusto */

@WebServlet("/writestudent")
public class WriteStudent extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        Student student = new Student
        (
            new Generator().generateStudentKey(),
            request.getParameter("school_field"),
            request.getParameter("course"),
            request.getParameter("class"),
            request.getParameter("reader_code")
        );
        
        if (new StudentDAO().writeStudent(student))
        {
            request.setAttribute("back_link", "show/readers/");
            request.setAttribute("info", "Estudante gravado com sucesso!");
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
