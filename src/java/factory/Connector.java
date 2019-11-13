
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Albertino Augusto */

public class Connector 
{
        
    private String ip = "localhost";
    private String port = "3306";
    private String username = "root";
    private String password = "";
    private String dataBaseName = "BOOK_MANAGER";
    
    private Connection connection;
    
    public Connector()
    { 
        this.connection = null;
    }
    
    public Connection getConnection()
    {  
        try
        {            
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + this.dataBaseName, this.username, this.password);
            return this.connection;
        }       
        catch(ClassNotFoundException | SQLException e) 
        {
            System.out.println("Error: " + e);
            return this.connection;
        } 
    }
    
    
    public void closeConnections(Statement statement, ResultSet resultSet, Connection connection)
    {
        
        try 
        {
            if (statement != null)
            {
                statement.close();
            }

            if (resultSet != null)
            {
                resultSet.close();
            }

            if (connection != null)
            {
                connection.close();
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }
    
    
    public void closeConnections(PreparedStatement statement, ResultSet resultSet, Connection connection)
    {
        
        try 
        {
            if (statement != null)
            {
                statement.close();
            }

            if (resultSet != null)
            {
                resultSet.close();
            }

            if (connection != null)
            {
                connection.close();
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }
}
