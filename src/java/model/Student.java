package model;

/**
 *
 * @author Albertino Augusto
 */
public class Student
{

    private String studentCode;
    private String school;
    private String course;
    private String theClass;
    private String readerCode;

    public Student(String studentCode, String school, String course, String theClass, String readerCode)
    {
        this.studentCode = studentCode;
        this.school = school;
        this.course = course;
        this.theClass = theClass;
        this.readerCode = readerCode;
    }

    public String getStudentCode()
    {
        return studentCode;
    }

    public void setStudentCode(String studentCode)
    {
        this.studentCode = studentCode;
    }

    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getTheClass()
    {
        return theClass;
    }

    public void setTheClass(String theClass)
    {
        this.theClass = theClass;
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
