package model;

/**
 *
 * @author Albertino Augusto
 */
public class Require
{

    private String requireCode;
    private String readerCode;
    private String bookCode;
    private int userId;
    private String requireType;
    private int amount;
    private String requireTime;
    private String requireDate;

    public Require(String requireCode, String readerCode, String bookCode, int userId, String requireType, int amount, String requireTime, String requireDate)
    {
        this.requireCode = requireCode;
        this.readerCode = readerCode;
        this.bookCode = bookCode;
        this.userId = userId;
        this.requireType = requireType;
        this.amount = amount;
        this.requireTime = requireTime;
        this.requireDate = requireDate;
    }

    public String getRequireCode()
    {
        return requireCode;
    }

    public void setRequireCode(String requireCode)
    {
        this.requireCode = requireCode;
    }

    public String getReaderCode()
    {
        return readerCode;
    }

    public void setReaderCode(String readerCode)
    {
        this.readerCode = readerCode;
    }

    public String getBookCode()
    {
        return bookCode;
    }

    public void setBookCode(String bookCode)
    {
        this.bookCode = bookCode;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getRequireType()
    {
        return requireType;
    }

    public void setRequireType(String requireType)
    {
        this.requireType = requireType;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public String getRequireTime()
    {
        return requireTime;
    }

    public void setRequireTime(String requireTime)
    {
        this.requireTime = requireTime;
    }

    public String getRequireDate()
    {
        return requireDate;
    }

    public void setRequireDate(String requireDate)
    {
        this.requireDate = requireDate;
    }

    

    
    
}
