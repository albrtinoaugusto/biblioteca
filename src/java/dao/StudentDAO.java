package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Student;
import services.Security;

/**
 *
 * @author Albertino Augusto
 */
public class StudentDAO
{

    
    private Student student;

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;

    
    public StudentDAO()
    {
        this.student = null;

        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }

    
    
    public boolean writeStudent(Student student)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO student VALUES('" + student.getStudentCode() + "', '" + student.getSchool() + "', '" + student.getCourse() + "', '" + student.getTheClass() + "', '" + student.getReaderCode() + "');";
            this.statement.executeUpdate(sql);
            done = true;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return done;
    }

    
    
    public boolean updateStudent(Student student)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE student SET school='" + student.getSchool() + "', course='" + student.getCourse() + "', class='" + student.getTheClass() + "', reader_code='"+student.getReaderCode()+"' where student_code='" + student.getStudentCode() + "'";
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

    
    
    public List getStudents()
    {

        List<Student> studentsList = new ArrayList<Student>();

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from student");

            while (this.resultSet.next())
            {
                Student s = new Student(
                        this.resultSet.getString("student_code"),
                        this.resultSet.getString("school"),
                        this.resultSet.getString("course"),
                        this.resultSet.getString("class"),
                        this.resultSet.getString("reader_code")
                );

                studentsList.add(s);
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return studentsList;
    }

    
    
    public Student getStudentByID(String id)
    {
        Student p = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM student where student_code='" + id + "'");

            while (this.resultSet.next())
            {
                p = new Student(
                        this.resultSet.getString("student_code"),
                        this.resultSet.getString("school"),
                        this.resultSet.getString("course"),
                        this.resultSet.getString("class"),
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
    
    

    public boolean deleteStudent(String id)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM student where student_code='" + id + "'");
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

    
    
    public int countStudents()
    {
        int number = 0;

        try
        {

            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from student");
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

    public Student getStudent()
    {
        return this.student;
    }

}
