package dao;

import factory.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import services.Security;

/**
 *
 * @author Albertino Augusto
 */
public class BookDAO
{
    
    private Book book;

    private Statement statement;
    private ResultSet resultSet;
    private Connection connection;
    private Security security;

    
    public BookDAO()
    {
        this.book = null;

        this.statement = null;
        this.resultSet = null;
        this.security = new Security();
        this.connection = new Connector().getConnection();
    }
    
    
    public boolean writeBook(Book book)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            String sql = "INSERT INTO book VALUES('" + book.getBookCode() + "', '" + book.getTittle() + "', '" + book.getAuthor() + "', '" + book.getCategory() + "', '"+ book.getPublisher()+ "', '"+book.getPublishYear()+"', '"+book.getBrandComme()+"', '"+book.getTime()+"', '"+book.getAmount()+"', '"+book.getTunel()+"', '"+book.getShelf()+"');";
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

    
    
    public boolean updateAmount(String bookCode, int amount)
    {
        boolean done = false;
        
        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE book SET amount = amount - '" + amount + "' where book_code='" + bookCode + "'";
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
    
    
    public boolean increaseAmount(String bookCode, int amount)
    {
        boolean done = false;
        
        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE book SET amount = amount + '" + amount + "' where book_code='" + bookCode + "'";
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
    
    
    public boolean updateBook(Book book)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();

            String sql = "UPDATE book SET tittle='" + book.getTittle() + "', "
                    + "author='" + book.getAuthor() + "', "
                    + "category='" + book.getCategory() + "', "
                    + "publisher='" + book.getPublisher() + "', "
                    + "publish_year='" + book.getPublishYear() + "', "
                    + "brand_comme='" + book.getBrandComme() + "', "
                    + "time='" + book.getTime()+ "', "
                    + "amount='" + book.getAmount() + "', "
                    + "tunel='" + book.getTunel() + "', "
                    + "shelf='" + book.getShelf() + "' "
                    + "where book_code='" + book.getBookCode()+ "'";
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

    
    
    public List getBooks(int limit, int offset)
    {
        List<Book> booksList = new ArrayList<Book>();

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from book LIMIT "+ limit + " OFFSET "+ offset);

            while (this.resultSet.next())
            {
                Book b = new Book(
                    this.resultSet.getString("book_code" ),
                    this.resultSet.getString("tittle"),
                    this.resultSet.getString("author"),
                    this.resultSet.getString("category"),
                    this.resultSet.getString("publisher"),
                    this.resultSet.getInt("publish_year"), 
                    this.resultSet.getString("brand_comme"),	
                    this.resultSet.getString("time"),
                    this.resultSet.getInt("amount"),
                    this.resultSet.getInt("tunel"),
                    this.resultSet.getString("shelf")    
                );

                booksList.add(b);
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return booksList;
    }
    
    
    
    public List getBooks()
    {
        List<Book> booksList = new ArrayList<Book>();

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select * from book");

            while (this.resultSet.next())
            {
                Book b = new Book(
                    this.resultSet.getString("book_code" ),
                    this.resultSet.getString("tittle"),
                    this.resultSet.getString("author"),
                    this.resultSet.getString("category"),
                    this.resultSet.getString("publisher"),
                    this.resultSet.getInt("publish_year"), 
                    this.resultSet.getString("brand_comme"),	
                    this.resultSet.getString("time"),
                    this.resultSet.getInt("amount"),
                    this.resultSet.getInt("tunel"),
                    this.resultSet.getString("shelf")    
                );

                booksList.add(b);
            }
        }
        catch (SQLException e)
        {

        }
        finally
        {
            new Connector().closeConnections(this.statement, this.resultSet, this.connection);
        }

        return booksList;
    }

    
    
    public Book getBookByID(String id)
    {
        Book b = null;

        try
        {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM book where book_code='" + id + "'");

            while (this.resultSet.next())
            {
                b = new Book(
                    this.resultSet.getString("book_code" ),
                    this.resultSet.getString("tittle"),
                    this.resultSet.getString("author"),
                    this.resultSet.getString("category"),
                    this.resultSet.getString("publisher"),
                    this.resultSet.getInt("publish_year"), 
                    this.resultSet.getString("brand_comme"),	
                    this.resultSet.getString("time"),
                    this.resultSet.getInt("amount"),
                    this.resultSet.getInt("tunel"),
                    this.resultSet.getString("shelf") 
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

        return b;
    }
    
    

    public boolean deleteBook(String id)
    {
        boolean done = false;

        try
        {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate("DELETE FROM book where book_code='" + id + "'");
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

    
    
    public int countBooks()
    {
        int number = 0;

        try
        {

            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery("select count(*) AS counter from book");
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

    
    public Book getBook()
    {
        return this.book;
    }

    

}
