
package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;
import services.Security;


/**
 *
 * @author Albertino Augusto */

public class UserDAO 
{
    
    private User user;
    
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;
    
    public UserDAO()
    {
        this.user = null;
        
        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }
    
    
    public boolean checkUser(String username, String password)
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from user where username='" + username + "' and password='" + this.security.encrypt(password) + "'");
            
            while (this.resultSet.next()) 
            {    
                done = true;
                this.user = new User(this.resultSet.getInt("user_id"), this.resultSet.getString("name"), this.resultSet.getString("surname"), this.resultSet.getString("username"), this.security.decrypt(this.resultSet.getString("password")), this.resultSet.getInt("nivel"));
            }
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
    
    
    public User getUser(String username, String password)
    {
        User u = null;
        
        try 
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from user where username='" + username + "' and password='" + this.security.encrypt(password) + "'");
            
            while (this.resultSet.next())
            {
                u = new User
                (
                    this.resultSet.getInt("user_id"), 
                    this.resultSet.getString("name"), 
                    this.resultSet.getString("surname"), 
                    this.resultSet.getString("username"), 
                    this.resultSet.getString("password"), 
                    this.resultSet.getInt("nivel")
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

        return u; 
    }
    
    
    
    
    public boolean writeUser(User user)
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO user VALUES(NULL, '" + user.getName() + "', '" + user.getSurname() + "', '" + user.getUsername() + "', '" + this.security.encrypt(user.getPassword()) + "', '" + user.getNivel()+ "');";
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
    
    
    
    public boolean updateUser(User user) 
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            String sql = "UPDATE user SET name='" + user.getName() + "', surname='" + user.getSurname() + "', username='"+ user.getUsername() +"' password='" + this.security.encrypt(user.getPassword()) + "' where user_id='"+user.getUserId()+"'";
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
    
    
    
    public boolean changePassword(String id, String password)
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            String sql = "UPDATE user SET password='" + this.security.encrypt(password) + "' WHERE user_id='"+ id +"'";
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
    
    
    
    public List getUsers()
    {
        
        List<User> usersList = new ArrayList<User>();
        
        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from user order by user_id desc");
            
            while (this.resultSet.next())
            {
                User u = new User(this.resultSet.getInt("user_id"), this.resultSet.getString("name"), this.resultSet.getString("surname"), this.resultSet.getString("username"), this.security.decrypt(this.resultSet.getString("password")), this.resultSet.getInt("nivel"));
                usersList.add(u);
            }
        }
        catch(SQLException e)
        {
            
        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }
        
        return usersList;
    }
    
    
    public List getUsers(String regex)
    {
        
        List<User> usersList = new ArrayList<User>();
        
        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from user WHERE name LIKE '%"+ regex +"%'");
            
            while (this.resultSet.next())
            {
                User u = new User(this.resultSet.getInt("user_id"), this.resultSet.getString("name"), this.resultSet.getString("surname"), this.resultSet.getString("username"), this.security.decrypt(this.resultSet.getString("password")), this.resultSet.getInt("nivel"));
                usersList.add(u);
            }
        }
        catch(SQLException e)
        {
            
        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }
        
        return usersList;
    }
    
    
    
    public User getRootUserByID(String id)
    {
        User u = null;
        
        try 
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM root_user where id='" + id + "'");
            
            while (this.resultSet.next())
            {
                u = new User
                (
                    this.resultSet.getInt("id"), 
                    this.resultSet.getString("name"), 
                    this.resultSet.getString("surname"), 
                    this.resultSet.getString("username"), 
                    this.resultSet.getString("password"), 
                    this.resultSet.getInt("nivel")
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

        return u; 
    }
    
    
    
    public boolean deleteUser(String id)
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM user where user_id='" + id + "'");
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
    
    
    
    public int countUsers()
    {
        int number = 0;
        
        try 
        {
            
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from user");
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
    
       
    
    public User getUser()
    {
        return this.user;
    }


}
