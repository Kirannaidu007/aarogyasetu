/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailsender;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author user
 */
public class MailSender {

    private static String USER_NAME = "priyagupta8626@gmail.com";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "DpgitM12"; // GMail password
    private static String RECIPIENT = "priyagupta8626@gmail.com";

    public static void main(String[] args) {
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = {"priyagupta8626@gmail.com"}; // list of recipient email addresses
        String subject = "Testly";
        String body = "Dear Sir,This is just testly Hi from our side.Regards,Priya Gupta";

        sendFromGMail(from, pass, to, subject, body);
    }

    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        //props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for (int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            //message.setContent ("<h1>Dear Sir,</h1>","text/html");
            //message.setContent ("<h2>This is just textly Hi from our side.</h2>","text/html");
           // message.setContent ("<h3>Rgards, Messaging</h3>","text/html");
            message.setContent(body,"text/html");
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (AddressException ae) {
            ae.printStackTrace();
        } catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}
