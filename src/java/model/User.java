
package model;

/**
 *
 * @author Albertino Augusto  */

public class User
{
    
    private int userId;
    private String name;    
    private String surname; 
    private String username;
    private String password;
    private int nivel;     

    public User(int userId, String name, String surname, String username, String password, int nivel)
    {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.nivel = nivel;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
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

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    
    
}
