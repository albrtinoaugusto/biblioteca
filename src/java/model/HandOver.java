package model;

/**
 *
 * @author Albertino Augusto
 */
public class HandOver
{

    private String handoverCode;
    private String readerCode;
    private String bookCode;
    private int userId;
    private String requireCode;
    private String requireType;
    private String handoverTime;
    private String handoverDate;

    
    public HandOver(String handoverCode, String readerCode, String bookCode, int userId, String requireCode, String requireType, String handoverTime, String handoverDate)
    {
        this.handoverCode = handoverCode;
        this.readerCode = readerCode;
        this.bookCode = bookCode;
        this.userId = userId;
        this.requireCode = requireCode;
        this.requireType = requireType;
        this.handoverTime = handoverTime;
        this.handoverDate = handoverDate;
    }

    public String getHandoverCode()
    {
        return handoverCode;
    }

    public void setHandoverCode(String handoverCode)
    {
        this.handoverCode = handoverCode;
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

    public String getRequireCode()
    {
        return requireCode;
    }

    public void setRequireCode(String requireCode)
    {
        this.requireCode = requireCode;
    }

    public String getRequireType()
    {
        return requireType;
    }

    public void setRequireType(String requireType)
    {
        this.requireType = requireType;
    }

    public String getHandoverTime()
    {
        return handoverTime;
    }

    public void setHandoverTime(String handoverTime)
    {
        this.handoverTime = handoverTime;
    }

    public String getHandoverDate()
    {
        return handoverDate;
    }

    public void setHandoverDate(String handoverDate)
    {
        this.handoverDate = handoverDate;
    }

    

}
