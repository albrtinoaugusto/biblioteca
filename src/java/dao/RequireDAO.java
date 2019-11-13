package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Require;
import services.Security;

/**
 *
 * @author Albertino Augusto
 */
public class RequireDAO
{
    
    private Require require;

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;

    
    public RequireDAO()
    {
        this.require = null;

        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }
    
    
    public boolean writeRequire(Require require)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO requires VALUES('" + require.getRequireCode() + "', '" + require.getReaderCode() + "', '" + require.getBookCode() + "', '" + require.getUserId() + "', '"+ require.getRequireType() + "', '"+ require.getRequireTime() +"', '"+ require.getRequireDate() +"');";
            this.statement.executeUpdate(sql);
            
            new BookDAO().updateAmount(require.getBookCode(), require.getAmount());
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

    
    
    public boolean updateRequire(Require require)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE requires SET reader_code='" + require.getReaderCode() + "', book_code='" + require.getBookCode() + "', user_id='"+ require.getUserId() +"', require_type='" + require.getRequireType() + "', require_time='" + require.getRequireTime() + "', require_date='" + require.getRequireDate() + "' where require_code='" + require.getRequireCode() + "'";
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

    
    
    public List getRequires()
    {
        List<Require> requireList = new ArrayList<Require>();

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from requires");

            while (this.resultSet.next())
            {
                Require r = new Require(
                    this.resultSet.getString("require_code" ),
                    this.resultSet.getString("reader_code"),
                    this.resultSet.getString("book_code"),
                    this.resultSet.getInt("user_id"),
                    this.resultSet.getString("require_type"),
                    0,     
                    this.resultSet.getString("require_time"), 
                    this.resultSet.getString("require_date")	
                );

                requireList.add(r);
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return requireList;
    }

    
    
    public Require getRequireByID(String id)
    {
        Require r = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM requires where require_code='" + id + "'");

            while (this.resultSet.next())
            {
                r = new Require(
                    this.resultSet.getString("require_code" ),
                    this.resultSet.getString("reader_code"),
                    this.resultSet.getString("book_code"),
                    this.resultSet.getInt("user_id"),
                    this.resultSet.getString("require_type"),
                    0,     
                    this.resultSet.getString("require_time"), 
                    this.resultSet.getString("require_date")
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

        return r;
    }
    
    
    
    public Require getRequireByBookCode(String id)
    {
        Require r = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM requires where book_code='" + id + "'");

            while (this.resultSet.next())
            {
                r = new Require(
                    this.resultSet.getString("require_code" ),
                    this.resultSet.getString("reader_code"),
                    this.resultSet.getString("book_code"),
                    this.resultSet.getInt("user_id"),
                    this.resultSet.getString("require_type"),
                    0,     
                    this.resultSet.getString("require_time"), 
                    this.resultSet.getString("require_date")
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

        return r;
    }
    
    

    public boolean deleteRequire(String id)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM requires where require_code='" + id + "'");
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

    
    
    public int countRequires()
    {
        int number = 0;

        try
        {

            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from requires");
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

    
    public Require getRequire()
    {
        return this.require;
    }

}
