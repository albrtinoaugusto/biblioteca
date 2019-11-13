//
//package services;
//
//import java.awt.HeadlessException;
//import java.util.Properties;
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import javax.mail.util.ByteArrayDataSource;
//
///**
// *
// * @author Albertino Augusto */
//
//public class EmailAttachment 
//{
//    
//    private String authEmail = "candidatoaprovado@aiorecrutamento.com";
//    private String authPass = "123456789";
//    
//    private int port = 2525;
//    private String host = "mail.aiorecrutamento.com";
//    private String setFrom = "candidatoaprovado@aiorecrutamento.com";
//    
//    private String emailTo;
//    private String subject;
//    private String msg;
//    private byte[] bytes; 
//    private String fileName;
//    
//    private Properties propes = new Properties();
//    
//    public EmailAttachment(String emailTo, String name, String email, byte[] bytes, String fileName, String vacancy)
//    {
//        this.emailTo = emailTo;
//        this.bytes = bytes;
//        this.fileName = fileName;
//        
//        this.subject = "Envio de Candidatura";
//        this.msg = "O AIO Recrutamento reencaminha o candidato de " 
//                     + "<br/>Nome: " + name + " " 
//                     + "<br/>E-mail: " + email + " "
//                     + "<br/>E o respectivo Cv em Anexo! "
//                     + "<br/>É uma candidatura expontánea a vaga de "+ vacancy +"!";
//    }
//    
//    
//    
//    public EmailAttachment(String emailTo, String name, String email, byte[] bytes, String fileName, String vacancy, int value)
//    {
//        this.emailTo = emailTo;
//        this.bytes = bytes;
//        this.fileName = fileName;
//        
//        this.subject = "Envio de Candidatura";
//        this.msg = "O AIO Recrutamento reencaminha o candidato de " 
//                     + "<br/>Nome: " + name + " " 
//                     + "<br/>Email: " + email + " "
//                     + "<br/>E o respectivo Cv em Anexo! "
//                     + "<br/>Por ter aprovado na avaliação de candidatura a vaga de "+ vacancy +" com " + value + " valores!";
//    }
//    
//    
//    public boolean sendAttachmentEmail()
//    {
//        
//        boolean done = false;
//        
//        this.propes.put("mail.smtp.host", this.host);
//        this.propes.put("mail.smtp.port", this.port);
//        this.propes.put("mail.smtp.auth", true);
//        
//        Session session = Session.getDefaultInstance(this.propes, new javax.mail.Authenticator() 
//        {
//            @Override
//            protected javax.mail.PasswordAuthentication getPasswordAuthentication()
//            {
//                return new javax.mail.PasswordAuthentication(authEmail, authPass);
//            }
//        });
//        
//        
//        try
//        {
//            
//            System.out.println("Before send email");
//            
//            
//            // Create a default MimeMessage
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(this.setFrom));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo));
//            message.setSubject(this.subject);
//            
//            BodyPart messageBodyPart = new MimeBodyPart();
//            messageBodyPart.setText(this.msg);
//            
//            Multipart multiPart = new MimeMultipart();
//            multiPart.addBodyPart(messageBodyPart);
//            messageBodyPart = new MimeBodyPart();
//            
////            String fileName = "/home/manisha/file.txt";
////            DataSource source = new FileDataSource(fileName);
////            messageBodyPart.setDataHandler(new DataHandler(source));
////            messageBodyPart.setFileName(fileName);
////            multiPart.addBodyPart(messageBodyPart);
//
////            JOptionPane.showMessageDialog(null, this.fileName);
//            
//            String applicationType = "";
//                    
//            if (this.fileName.contains(".doc"))
//            {
//                applicationType = "application/msword";
//            }
//            else if (this.fileName.contains(".pdf"))
//            {
//                applicationType = "application/pdf";
//            }
//            else if (this.fileName.contains(".txt"))
//            {
//                applicationType = "text/plain";
//            }
//            else if (this.fileName.contains(".xlsx"))
//            {
//                applicationType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
//            }
//            
////            JOptionPane.showMessageDialog(null, applicationType);
//            
//            DataSource byteArrayDataSource = new ByteArrayDataSource(this.bytes, applicationType);
//            DataHandler dataHandler = new DataHandler(byteArrayDataSource);
//            
//            messageBodyPart.setDataHandler(dataHandler);
//            messageBodyPart.setFileName(this.fileName);
//            multiPart.addBodyPart(messageBodyPart);
//            
//            message.setHeader("Content-Type", "text/html; charset=\"iso-8859-1\"");
//            message.setContent(this.msg, "text/html; charset=iso-8859-1");
//            message.setHeader("Content-Transfer-Encoding", "quoted-printable");
//            message.saveChanges();
//            
//            // Send complete msg
//            message.setContent(multiPart);
//            Transport.send(message);
//            done = true;
//            
//            System.out.println("Email sent");
//        }
//        catch(MessagingException | HeadlessException e)
//        {
////            JOptionPane.showMessageDialog(null, e);
//        }
//        
//        return done;
//    }
//}
