package model;

/**
 *
 * @author Albertino Augusto
 */
public class Reader
{

    private String readerCode;
    private String name;
    private String surname;
    private int sexo;
    private String bornDate;
    private String address;
    private String docType;
    private String numDoc;
    private String bornPlace;
    private String contact;
    private String category;

    public Reader(String readerCode, String name, String surname, int sexo, String bornDate, String address, String docType, String numDoc, String bornPlace, String contact, String category)
    {
        this.readerCode = readerCode;
        this.name = name;
        this.surname = surname;
        this.sexo = sexo;
        this.bornDate = bornDate;
        this.address = address;
        this.docType = docType;
        this.numDoc = numDoc;
        this.bornPlace = bornPlace;
        this.contact = contact;
        this.category = category;
    }

    public String getReaderCode()
    {
        return readerCode;
    }

    public void setReaderCode(String readerCode)
    {
        this.readerCode = readerCode;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getSexo()
    {
        return sexo;
    }

    public void setSexo(int sexo)
    {
        this.sexo = sexo;
    }

    public String getBornDate()
    {
        return bornDate;
    }

    public void setBornDate(String bornDate)
    {
        this.bornDate = bornDate;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getDocType()
    {
        return docType;
    }

    public void setDocType(String docType)
    {
        this.docType = docType;
    }

    public String getNumDoc()
    {
        return numDoc;
    }

    public void setNumDoc(String numDoc)
    {
        this.numDoc = numDoc;
    }

    public String getBornPlace()
    {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace)
    {
        this.bornPlace = bornPlace;
    }

    public String getContact()
    {
        return contact;
    }

    public void setContact(String contact)
    {
        this.contact = contact;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    
    
    
}
