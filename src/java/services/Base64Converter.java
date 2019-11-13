
package services;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Albertino Augusto
 */
public class Base64Converter 
{
    
    public String encodeToString(BufferedImage bufferedImage, String type)
    {
        String imageString = null;
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        
        try
        {
            ImageIO.write(bufferedImage, type, bos);
            byte[] imageBytes = bos.toByteArray();
            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);
            bos.close();
        }
        catch(IOException e)
        {
            
        }
        
        return imageString;
    }
    
    
    public BufferedImage decodeToImage(String imageString)
    {
        BufferedImage image = null;
        byte[] imageByte;
        
        try
        {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        }
        catch(IOException e)
        {
            
        }
        
        return image;
    }
    
    
    
    public InputStream decodeToInputStream(String docString)
    {
        InputStream inputStream = null;
        
        try
        {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] docByte = decoder.decodeBuffer(docString);
            inputStream = new ByteArrayInputStream(docByte);
        }
        catch(IOException e)
        {
            
        }
        
        return inputStream;
    }
}
