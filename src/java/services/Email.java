//
//package services;
//
//import dao.CandidateDAO;
//import dao.CandidateLoginDAO;
//import dao.CompanyDAO;
//import dao.CompanyLoginDAO;
//import java.awt.HeadlessException;
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import model.Candidate;
//import model.CandidateLogin;
//import model.Company;
//import model.CompanyLogin;
//import model.Interview;
//
///**
// *
// * @author Albertino Augusto */
//
//public class Email 
//{
//    
//    private String authEmail = "registo@aiorecrutamento.com";
//    private String authPass = "123456789";
//    
//    private int port;
//    private String host;
//    private String setFrom;
//    
//    private String subject;
//    private String message;
//    private String[] mailsTo;
//    
//    private Security security = security = new Security();
//    private Properties propes = new Properties();
//    
//    public Email()
//    {
//        this.port = 2525;
//        this.host = "mail.aiorecrutamento.com";
//        
//        this.setFrom = "registo@aiorecrutamento.com"; 
//   }
//    
//        
//    public Email(String email, String link, int who)
//    {
//        
//        String name = "";
//        
//        String[] e = {email};
//        
//        if (who == 0)
//        {
//            name = new CandidateDAO().getCandidate(new CandidateLoginDAO().getCandidateLoginByEmail(e[0]).getIdCandidate()).getName();
//            
//            
//            this.mailsTo = e;
//            
//            this.subject = "Recuperação de Senha";
//            this.message = "Olá "+ name +",<br/> " + 
//                           "Para recuperar a sua senha, clique no link abaixo: <br/>" +
//                           "<h4>" + link + "</h4><br/>" +
//                           "Com os melhores cumprimentos.<br/>" + 
//                           "Equipa | AIO Recrutamento";
//        }
//        else
//        {
//            name = new CompanyDAO().getCompanyByID(new CompanyLoginDAO().getCompanyLoginByEmail(e[0]).getCompanyId()).getCompanyName();
//            
//            this.mailsTo = e;
//            
//            this.subject = "Recuperação de Senha";
//            this.message = "Olá "+ name +",<br/> " + 
//                           "Para recuperar a senha, clique no link abaixo: <br/>" +
//                           "<h4>" + link + "</h4><br/>" +
//                           "Com os melhores cumprimentos.<br/>" + 
//                           "Equipa | AIO Recrutamento";
//        }
//        
//        
//        this.authEmail = "recuperarsenha@aiorecrutamento.com";
//        this.authPass = "123456789";
//        
//        this.port = 2525;
//        this.host = "mail.aiorecrutamento.com";
//        this.setFrom = "recuperarsenha@aiorecrutamento.com";
//    }
//    
//    
//    public Email(String[] mailsTo, String vacancyName, boolean isDjob)
//    {
//        String name;
//        
//        if (isDjob)
//        {
//            this.mailsTo = mailsTo;
//            this.subject = "Actualização de Vagas";
//            this.message = "Olá, <br/> + "
//                         + "Veja actualização das Vagas de Emprego desponíveis nas suas áreas de interesse. <br/>"
//                         + "Nova Vaga de " + vacancyName + "lançada <br/>"
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        else
//        {
//            this.mailsTo = mailsTo;
//            this.subject = "Actualização de Vagas";
//            this.message = "Olá, <br/> + "
//                         + "Veja actualização das Vagas de Estágio desponíveis nas suas áreas de interesse. <br/>"
//                         + "Nova Vaga de " + vacancyName + "lançada <br/>"
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        
//        
//        this.authEmail = "info@aiorecrutamento.com";
//        this.authPass = "123456789";
//        
//        this.port = 2525;
//        this.host = "mail.aiorecrutamento.com";
//        this.setFrom = "info@aiorecrutamento.com";
//    }
//    
//    
//    
//    public Email(Candidate candidate, String link, int confirmationType)
//    {
//        
//        CandidateLogin candidateLogin = new CandidateLoginDAO().getCandidateLoginById(candidate.getIdCandidate());
//        
//        if (confirmationType == 0)
//        {
//            String[] email = {candidateLogin.getEmail().toLowerCase()};
//            this.mailsTo = email;
//            this.subject = "Bem Vindo";
//            this.message = "Olá " + candidate.getName() +",<br/>"
//                         + "Agradecemos por se juntar a plataforma, Para activar a sua conta clique no link abaixo: <br/>"
//                         + "<h4>"+ link +"</h4>.<br/>"  
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        
//        if (confirmationType == 1)
//        {
//            String[] email = {candidateLogin.getEmail().toLowerCase()};
//            this.mailsTo = email;
//            this.subject = "Alteração de Senha";
//            this.message = "Olá " + candidate.getName() + ",<br/>"
//                         + "A sua senha foi alterada / actualizada com sucesso. <br/>"
//                         + "Para confirmar click no link abaixo: <br/>"
//                         + "<h4>" + link + " </h4><br/>"
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        
//        if (confirmationType == 2)
//        {
//            String[] email = {candidateLogin.getEmail().toLowerCase()};
//            this.mailsTo = email;
//            this.subject = "Alteração de Senha";
//            this.message = "Olá " + candidate.getName() + ",<br/>"
//                         + "O seu email foi alterado / actualizado com sucesso. <br/>"
//                         + "Para confirmar click no link abaixo: <br/>"
//                         + "<h4>" + link + " </h4><br/>"
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        
//        this.authEmail = "registo@aiorecrutamento.com";
//        this.authPass = "123456789";
//        
//        this.port = 2525;
//        this.host = "mail.aiorecrutamento.com";
//        this.setFrom = "registo@aiorecrutamento.com";
//        
//    }
//    
//    
//    public Email(Company company, String link, int confirmationType)
//    {
//        
//        CompanyLogin companyLogin = new CompanyLoginDAO().getCompanyLoginById(company.getCompanyId());
//        
//        if (confirmationType == 0)
//        {
//            String[] email = {companyLogin.getEmail().toLowerCase()};
//            this.mailsTo = email;
//            this.subject = "Bem Vindo";
//            this.message = "Olá " + company.getCompanyName() +",<br/>"
//                         + "Agradecemos por se juntar a plataforma, Para activar a sua conta clique no link abaixo: <br/>"
//                         + "<h4>"+ link +"</h4>.<br/>"  
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        
//        if (confirmationType == 1)
//        {
//            String[] email = {companyLogin.getEmail().toLowerCase()};
//            this.mailsTo = email;
//            this.subject = "Alteração de Senha";
//            this.message = "Olá " + company.getCompanyName() + ",<br/>"
//                         + "A senha foi alterada / actualizada com sucesso. <br/>"
//                         + "Para confirmar click no link abaixo: <br/>"
//                         + "<h4>" + link + " </h4><br/>"
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        
//        
//        if (confirmationType == 2)
//        {
//            String[] email = {companyLogin.getEmail().toLowerCase()};
//            this.mailsTo = email;
//            this.subject = "Alteração de Senha";
//            this.message = "Olá " + company.getCompanyName() + ",<br/>"
//                         + "O email foi alterado / actualizado com sucesso. <br/>"
//                         + "Para confirmar click no link abaixo: <br/>"
//                         + "<h4>" + link + " </h4><br/>"
//                         + "Com os melhores cumprimentos.<br/>" 
//                         + "Equipa | AIO Recrutamento";
//        }
//        
//        this.authEmail = "registo@aiorecrutamento.com";
//        this.authPass = "123456789";
//        
//        this.port = 2525;
//        this.host = "mail.aiorecrutamento.com";
//        this.setFrom = "registo@aiorecrutamento.com";
//     }
//    
//    
//    public Email(Interview interview)
//    {
//        
//        Company company = new CompanyDAO().getCompanyByID(interview.getCompanyId());
//        
//        Candidate candidate = new CandidateDAO().getCandidate(interview.getIdCandidate());
//        CandidateLogin candidateLogin = new CandidateLoginDAO().getCandidateLoginById(interview.getIdCandidate());
//        
//        
//        String[] mail = {candidateLogin.getEmail().trim()};
//        
//        this.mailsTo = mail;
//        this.subject = "Solicitação de Entrevista";
//        this.message = "Olá "+ candidate.getName() +",<br/> " + 
//                       "A " + company.getCompanyName() + " marcou uma entrevista consigo, eis os dados da mesma: <br/>" +
//                       "Dia " + interview.getDate() + " as " + interview.getTime()+ " <br/>" +
//                       "Endereço: " + interview.getAddress() + 
//                       "Com os melhores cumprimentos.<br/>" + 
//                       "Equipa | AIO Recrutamento";
//        
//        
//        this.authEmail = "entrevista@aiorecrutamento.com";
//        this.authPass = "123456789";
//        
//        this.port = 2525;
//        this.host = "mail.aiorecrutamento.com";
//        this.setFrom = "entrevista@aiorecrutamento.com";
//    }
//    
//    
//    
//    public boolean sendEmail()
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
//        try
//        {
//            
//            System.out.println("Before send email");
//            
//            Message msg = new MimeMessage(session);
//            msg.setFrom(new InternetAddress(this.setFrom));
//            
//            InternetAddress[] addresses = new InternetAddress[mailsTo.length];
//
//            for (int i = 0; i < mailsTo.length; i++)
//            {
//                addresses[i] = new InternetAddress(mailsTo[i]);
//            }
//            
//            msg.setRecipients(Message.RecipientType.TO, addresses);
//            msg.setSubject(this.subject);
//            msg.setText(this.message);
//            msg.setHeader("Content-Type", "text/html; charset=\"iso-8859-1\"");
//            msg.setHeader("Content-Transfer-Encoding", "quoted-printable");
//            msg.setContent(this.message, "text/html; charset=iso-8859-1");
//            msg.saveChanges();
//            Transport.send(msg);
//            
//            done = true;
//            
//            System.out.println("Email sent");
//        }
//        catch(MessagingException | HeadlessException e)
//        {
//            System.out.println("Error: " + e);
//        }
//        
//        return done;
//    }
//    
//    
////    MimeBodyPart textPart = new MimeBodyPart();
////    textPart.setHeader("Content-Type", "text/html; charset=\"iso-8859-1\"");
////    textPart.setContent(mail.getCorpo(), "text/html; charset=iso-8859-1");
////    textPart.setHeader("Content-Transfer-Encoding", "quoted-printable");
//                
////    public static void main(String[] args)
////    {
////        Properties properties = new Properties();
////        properties.put("mail.smtp.host", "mail.aiorecrutamento.com");
////        properties.put("mail.smtp.port", 2525);
////        properties.put("mail.smtp.auth", true);
////        
////        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() 
////        {
////            @Override
////            protected javax.mail.PasswordAuthentication getPasswordAuthentication()
////            {
////                return new javax.mail.PasswordAuthentication("registo@aiorecrutamento.com", "123456789");
////            }
////        });
////        
////        try
////        {
////            
////            JOptionPane.showMessageDialog(null, "antes");
////            
////            Message msg = new MimeMessage(session);
////            msg.setFrom(new InternetAddress("registo@aiorecrutamento.com"));
////            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ferlessrecall.tec@gmail.com"));
////            msg.setSubject("Test");
////            msg.setText("Ayo");
////            
////            Transport.send(msg);
////            
//////            done = true;
////            
////            JOptionPane.showMessageDialog(null, "done");
////        }
////        catch(MessagingException | HeadlessException e)
////        {
////            System.out.println("Error: " + e);
////        }
////        
//////        return done;
////        
//        
////    }
//}
