
package services;

import dao.BookDAO;
import dao.HandOverDAO;
import dao.ProfessorDAO;
import dao.ReaderDAO;
import dao.RequireDAO;
import dao.StudentDAO;
import dao.VisitorDAO;

/**
 *
 * @author Augusto Marrengula */

public class Generator
{
    
    
    private String generatedWord = "";
    
    private int randomizer;
    private int maxRandomNumber = 900;
    
    
    
    public Generator()
    {
        double randomNumber = Math.random();
        randomizer = (int) (1 + randomNumber * (maxRandomNumber - 1));
        this.generatedWord = "LGEN" + randomizer;
    }
    
    
    
    public String generateBookKey()
    {
        int count = new BookDAO().countBooks() + 1;
        return "B-" + count + "KEY" + count + this.generatedWord;
    }

  
    public String generateReaderKey()
    {
        int count = new ReaderDAO().countReaders() + 1;
        return "R-" + count + "KEY" + count + this.generatedWord;
    }
    
    
    public String generateVisitorKey()
    {
        int count = new VisitorDAO().countVisitors() + 1;
        return "V-" + count + "KEY" + count + this.generatedWord;
    }
    
    
    public String generateProfessorKey()
    {
        int count = new ProfessorDAO().countProfessors() + 1;
        return "P-" + count + "KEY" + count + this.generatedWord;
    }
    
    
    public String generateStudentKey()
    {
        int count = new StudentDAO().countStudents() + 1;
        return "S-" + count + "KEY" + count + this.generatedWord;
    }
    
    
    public String generateRequireKey()
    {
        int count = new RequireDAO().countRequires() + 1;
        return "R-" + count + "KEY" + count + this.generatedWord;
    }
    
    
    public String generateHandOverKey()
    {
        int count = new HandOverDAO().countHandOvers() + 1;
        return "H-" + count + "KEY" + count + this.generatedWord;
    }
    
}
