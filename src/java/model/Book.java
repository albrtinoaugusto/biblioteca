package model;

/**
 *
 * @author Albertino Augusto */
public class Book
{

    private String bookCode;
    private String tittle;
    private String author;
    private String category;
    private String publisher;
    private int publishYear;
    private String brandComme;
    private String time;
    private int amount;
    private int tunel;
    private String shelf;

    public Book(String bookCode, String tittle, String author, String category, String publisher, int publishYear, String brandComme, String time, int amount, int tunel, String shelf) 
    {
        this.bookCode = bookCode;
        this.tittle = tittle;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.brandComme = brandComme;
        this.time = time;
        this.amount = amount;
        this.tunel = tunel;
        this.shelf = shelf;
    }

    public String getBookCode() 
    {
        return bookCode;
    }

    public void setBookCode(String bookCode) 
    {
        this.bookCode = bookCode;
    }

    public String getTittle() 
    {
        return tittle;
    }

    public void setTittle(String tittle) 
    {
        this.tittle = tittle;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public int getPublishYear() 
    {
        return publishYear;
    }

    public void setPublishYear(int publishYear) 
    {
        this.publishYear = publishYear;
    }

    public String getBrandComme() 
    {
        return brandComme;
    }

    public void setBrandComme(String brandComme)
    {
        this.brandComme = brandComme;
    }

    public String getTime() 
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public int getAmount() 
    {
        return amount;
    }

    public void setAmount(int amount) 
    {
        this.amount = amount;
    }

    public int getTunel() 
    {
        return tunel;
    }

    public void setTunel(int tunel) 
    {
        this.tunel = tunel;
    }

    public String getShelf() 
    {
        return shelf;
    }

    public void setShelf(String shelf) 
    {
        this.shelf = shelf;
    }


}
