package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Visitor;
import services.Security;

/**
 *
 * @author Albertino Augusto
 */
public class VisitorDAO
{
    
    private Visitor visitor;

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;

    
    public VisitorDAO()
    {
        this.visitor = null;

        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }

    
    
    public boolean writeVisitor(Visitor visitor)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO visitor VALUES('" + visitor.getVisitorCode() + "', '" + visitor.getFromWhere() + "', '" + visitor.getCarrer() + "', '" + visitor.getReaderCode() + "');";
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

    
    
    public boolean updateVisitor(Visitor visitor)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE visitor SET from_where='" + visitor.getFromWhere() + "', carrer='" + visitor.getCarrer() + "', reader_code='" + visitor.getReaderCode() + "' where reader_code='" + visitor.getReaderCode()+ "'";
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

    
    
    public List getVisitors()
    {

        List<Visitor> visitorsList = new ArrayList<Visitor>();

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from visitor");

            while (this.resultSet.next())
            {
                Visitor v = new Visitor(
                        this.resultSet.getString("visitor_code"),
                        this.resultSet.getString("from_where"),
                        this.resultSet.getString("carrer"),
                        this.resultSet.getString("reader_code")
                );

                visitorsList.add(v);
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return visitorsList;
    }

    
    
    public Visitor getVisitorByID(String id)
    {
        Visitor v = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM visitor where visitor_code='" + id + "'");

            while (this.resultSet.next())
            {
                v = new Visitor(
                    this.resultSet.getString("visitor_code"),
                    this.resultSet.getString("from_where"),
                    this.resultSet.getString("carrer"),
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

        return v;
    }
    
    

    public boolean deleteVisitor(String id)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM visitor where visitor_code='" + id + "'");
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

    
    
    public int countVisitors()
    {
        int number = 0;

        try
        {

            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from visitor");
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

    
    public Visitor getVisitor()
    {
        return this.visitor;
    }

}
