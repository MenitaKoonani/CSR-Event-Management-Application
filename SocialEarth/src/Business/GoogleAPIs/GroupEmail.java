/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GoogleAPIs;

//import com.db4o.cs.internal.messages.Message;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
//import java.net.PasswordAuthentication;
import Business.Event.Event;
import Business.UserAccount.UserAccount;
import static java.lang.ProcessBuilder.Redirect.to;
import java.util.Properties;
import java.util.*;
import static java.util.Date.from;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.mail.PasswordAuthentication;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Menita Koonani
 */
public class GroupEmail {

    public final static String fromEmail = "socialearthglobalcause@gmail.com";
    public final static String password = "socialEarth123";

    public static void sendMail(Event registeredEvent, UserAccount registeredUser) {

        Properties props = new Properties();
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            String emailBodyText = "Thank you for registering for the "
                    + registeredEvent.getEventName()
                    + ".This event is happening at "
                    + registeredEvent.getVenue() + ", "
                    + registeredEvent.getZone() + ", "
                    + registeredEvent.getNetwork() + "See you there!!";
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(registeredUser.getEmployee().getEmail()));
            message.setSubject("Great! You have successfully registered for the event!!");
            message.setText("Hey " + registeredUser.getEmployee().getName() + "!"
                    + emailBodyText);
            Transport.send(message);
            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
