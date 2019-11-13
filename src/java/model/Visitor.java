package model;

/**
 *
 * @author Albertino Augusto
 */
public class Visitor
{

    private String visitorCode;
    private String fromWhere;
    private String carrer;
    private String readerCode;

    public Visitor(String visitorCode, String fromWhere, String carrer, String readerCode)
    {
        this.visitorCode = visitorCode;
        this.fromWhere = fromWhere;
        this.carrer = carrer;
        this.readerCode = readerCode;
    }

    public String getVisitorCode()
    {
        return visitorCode;
    }

    public void setVisitorCode(String visitorCode)
    {
        this.visitorCode = visitorCode;
    }

    public String getFromWhere()
    {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere)
    {
        this.fromWhere = fromWhere;
    }

    public String getCarrer()
    {
        return carrer;
    }

    public void setCarrer(String carrer)
    {
        this.carrer = carrer;
    }

    public String getReaderCode()
    {
        return readerCode;
    }

    public void setReaderCode(String readerCode)
    {
        this.readerCode = readerCode;
    }

}
