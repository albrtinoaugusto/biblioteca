package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.HandOver;
import services.Security;

/**
 *
 * @author Albertino Augusto
 */
public class HandOverDAO
{
    
    private HandOver handOver;

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;
    
    public HandOverDAO()
    {
        this.handOver = null;

        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }
    
    
    public boolean writeAndOver(HandOver handOver)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO handover VALUES('" + handOver.getHandoverCode() + "', '" + handOver.getReaderCode() + "', '" + handOver.getBookCode() + "', '" + handOver.getUserId() + "', '" + handOver.getRequireCode() + "', '" + handOver.getRequireType() + "', '"+ handOver.getHandoverTime() +"', '"+ handOver.getHandoverDate() +"');";
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

    
    
    public boolean updateHandOver(HandOver handOver)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE andover SET reader_code='" + handOver.getReaderCode() + "', book_code='" + handOver.getBookCode() + "', user_id='"+ handOver.getUserId() +"', require_code='"+ handOver.getRequireCode() +"', require_type='" + handOver.getRequireType() + "', handover_time='" + handOver.getHandoverTime() + "', handover_date='" + handOver.getHandoverDate() + "' where handover_code='" + handOver.getHandoverCode() + "'";
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

    
    
    public List getAndOvers()
    {
        
        List<HandOver> andOversList = new ArrayList<HandOver>();

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from handover");

            while (this.resultSet.next())
            {
                HandOver a = new HandOver(
                    this.resultSet.getString("handover_code" ),
                    this.resultSet.getString("reader_code"),
                    this.resultSet.getString("book_code"),
                    this.resultSet.getInt("user_id"),
                    this.resultSet.getString("require_code"),
                    this.resultSet.getString("require_type"),
                    this.resultSet.getString("handover_time"), 
                    this.resultSet.getString("handover_date")	
                );

                andOversList.add(a);
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return andOversList;
    }

    
    
    public HandOver getHandOverByID(String id)
    {
        HandOver a = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM handover where handover_code='" + id + "'");

            while (this.resultSet.next())
            {
                a = new HandOver(
                    this.resultSet.getString("handover_code" ),
                    this.resultSet.getString("reader_code"),
                    this.resultSet.getString("book_code"),
                    this.resultSet.getInt("user_id"),
                    this.resultSet.getString("require_code"),
                    this.resultSet.getString("require_type"),
                    this.resultSet.getString("handover_time"), 
                    this.resultSet.getString("handover_date")	
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

        return a;
    }
    
    
    public HandOver getHandOverByRequireCode(String requireCode)
    {
        HandOver a = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM handover where require_code='" + requireCode + "'");

            while (this.resultSet.next())
            {
                a = new HandOver(
                    this.resultSet.getString("handover_code" ),
                    this.resultSet.getString("reader_code"),
                    this.resultSet.getString("book_code"),
                    this.resultSet.getInt("user_id"),
                    this.resultSet.getString("require_code"),
                    this.resultSet.getString("require_type"),
                    this.resultSet.getString("handover_time"), 
                    this.resultSet.getString("handover_date")	
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

        return a;
    }
    
    
    public HandOver getHandOverByReaderCode(String readerCode)
    {
        HandOver a = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM handover where reader_code='" + readerCode + "'");

            while (this.resultSet.next())
            {
                a = new HandOver(
                    this.resultSet.getString("handover_code" ),
                    this.resultSet.getString("reader_code"),
                    this.resultSet.getString("book_code"),
                    this.resultSet.getInt("user_id"),
                    this.resultSet.getString("require_code"),
                    this.resultSet.getString("require_type"),
                    this.resultSet.getString("handover_time"), 
                    this.resultSet.getString("handover_date")	
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

        return a;
    }
    
    
    

    public boolean deleteAndOvers(String id)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM handover where handover_code='" + id + "'");
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

    
    
    public int countHandOvers()
    {
        int number = 0;

        try
        {

            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from handover");
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

    
    public HandOver getHandOver()
    {
        return this.handOver;
    }

}
