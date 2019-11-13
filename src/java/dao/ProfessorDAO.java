package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Reader;
import model.Professor;
import services.Security;

/**
 *
 * @author Albertino Augusto
 */
public class ProfessorDAO
{

    
    private Professor professor;

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;

    
    public ProfessorDAO()
    {
        this.professor = null;

        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }

    
    
    public boolean writeProfessor(Professor professor)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO professor VALUES('" + professor.getTeacherCode() + "', '" + professor.getSubject() + "', '" + professor.getCourse() + "', '" + professor.getReaderCode() + "');";
            this.statement.executeUpdate(sql);
            done = true;
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return done;
    }

    
    
    public boolean updateProfessor(Professor professor)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE professor SET subject='" + professor.getSubject() + "', course='" + professor.getCourse() + "', reader_code='" + professor.getReaderCode() + "' where professor_code='" + professor.getTeacherCode() + "'";
            this.statement.executeUpdate(sql);
            done = true;
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return done;
    }

    
    
    public List getProfessors()
    {

        List<Professor> professorsList = new ArrayList<Professor>();

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from professor");

            while (this.resultSet.next())
            {
                Professor p = new Professor(
                        this.resultSet.getString("professor_code"),
                        this.resultSet.getString("subject"),
                        this.resultSet.getString("course"),
                        this.resultSet.getString("reader_code")
                );

                professorsList.add(p);
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return professorsList;
    }

    
    
    public Professor getProfessorByID(String id)
    {
        Professor p = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM professor where professor_code='" + id + "'");

            while (this.resultSet.next())
            {
                p = new Professor(
                        this.resultSet.getString("professor_code"),
                        this.resultSet.getString("subject"),
                        this.resultSet.getString("course"),
                        this.resultSet.getString("reader_code")
                );
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return p;
    }
    
    

    public boolean deleteProfessor(String id)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM professor where professor_code='" + id + "'");
            done = true;
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return done;
    }

    
    
    public int countProfessors()
    {
        int number = 0;

        try
        {

            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from professor");
            this.resultSet.next();

            number = Integer.parseInt(this.resultSet.getString("counter"));
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return number;
    }

    public Professor getProfessor()
    {
        return this.professor;
    }

}
