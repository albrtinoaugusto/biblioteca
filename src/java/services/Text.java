
package services;

/**
 *
 * @author Augusto Marrengula */

public class Text 
{
    
    public String toCaptalize(String text)
    {
        String firstLetter = text.substring(0, 1);
        String wholeName = text.substring(1, text.length());
        
        return firstLetter.toUpperCase() + wholeName.toLowerCase();
    }
    
}
