package model;

/**
 *
 * @author Albertino Augusto
 */
public class Professor
{

    private String teacherCode;
    private String subject;
    private String course;
    private String readerCode;

    public Professor(String teacherCode, String subject, String course, String readerCode)
    {
        this.teacherCode = teacherCode;
        this.subject = subject;
        this.course = course;
        this.readerCode = readerCode;
    }

    public String getTeacherCode()
    {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode)
    {
        this.teacherCode = teacherCode;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
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
