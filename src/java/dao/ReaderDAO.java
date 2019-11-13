
package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Reader;
import services.Security;


/**
 *
 * @author Albertino Augusto */

public class ReaderDAO 
{
    
    private Reader reader;
    
    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;
    
    public ReaderDAO()
    {
        this.reader = null;
        
        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }
    
    
    public boolean writeReader(Reader reader)
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO reader VALUES('" + reader.getReaderCode() + "', '" + reader.getName() + "', '" + reader.getSurname() + "', '" + reader.getSexo() + "', '" + reader.getBornDate() + "', '" + reader.getAddress() + "', '" + reader.getDocType() + "', '" + reader.getNumDoc() + "', '" + reader.getBornPlace() + "', '" + reader.getContact() + "', '" + reader.getCategory() + "');";
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
    
    
    
    public boolean updateReader(Reader reader) 
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            String sql = "UPDATE reader SET name='" + reader.getName() + "', surname='" + reader.getSurname() + "', sex='" + reader.getSexo() + "', born_date='" + reader.getBornDate() + "', address='" + reader.getAddress() + "', doc_type='" + reader.getDocType() + "', num_doc='" + reader.getNumDoc() + "', born_place='" + reader.getBornPlace() + "', contact='" + reader.getContact() + "', category='" + reader.getCategory() + "' where reader_code='" + reader.getReaderCode() + "'";
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
    
    
    public List getReaders()
    {
        
        List<Reader> readersList = new ArrayList<Reader>();
        
        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from reader");
            
            while (this.resultSet.next())
            {
                Reader r = new Reader(
                        this.resultSet.getString("reader_code"),  
                        this.resultSet.getString("name"),  
                        this.resultSet.getString("surname"), 
                        this.resultSet.getInt("sex"),  
                        this.resultSet.getString("born_date"), 
                        this.resultSet.getString("address"), 
                        this.resultSet.getString("doc_type"), 
                        this.resultSet.getString("num_doc"), 
                        this.resultSet.getString("born_place"), 
                        this.resultSet.getString("contact"), 
                        this.resultSet.getString("category")
                );
                
                readersList.add(r);
            }
        }
        catch(SQLException e)
        {
            
        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }
        
        return readersList;
    }
    
    
    public List getReaders(String regex)
    {
        
        List<Reader> usersList = new ArrayList<Reader>();
        
        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from reader WHERE name LIKE '%"+ regex +"%'");
            
            while (this.resultSet.next())
            {
                Reader r = new Reader(
                        this.resultSet.getString("reader_code"),  
                        this.resultSet.getString("name"),  
                        this.resultSet.getString("surname"), 
                        this.resultSet.getInt("sex"),  
                        this.resultSet.getString("born_date"), 
                        this.resultSet.getString("address"), 
                        this.resultSet.getString("doc_type"), 
                        this.resultSet.getString("num_doc"), 
                        this.resultSet.getString("born_place"), 
                        this.resultSet.getString("contact"), 
                        this.resultSet.getString("category")
                );
                
                usersList.add(r);
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
    
    
    
    public Reader getReaderByID(String id)
    {
        Reader r = null;
        
        try 
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM reader where reader_code='" + id + "'");
            
            while (this.resultSet.next())
            {
                r = new Reader(
                        this.resultSet.getString("reader_code"),  
                        this.resultSet.getString("name"),  
                        this.resultSet.getString("surname"), 
                        this.resultSet.getInt("sex"),  
                        this.resultSet.getString("born_date"), 
                        this.resultSet.getString("address"), 
                        this.resultSet.getString("doc_type"), 
                        this.resultSet.getString("num_doc"), 
                        this.resultSet.getString("born_place"), 
                        this.resultSet.getString("contact"), 
                        this.resultSet.getString("category")
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
    
    
    
    public boolean deleteReader(String id)
    {
        boolean done = false;
        
        try 
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM reader where reader_code='" + id + "'");
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
    
    
    
    public int countReaders()
    {
        int number = 0;
        
        try 
        {
            
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from reader");
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
    
       
    
    public Reader getReader()
    {
        return this.reader;
    }


}
