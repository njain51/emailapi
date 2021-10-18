package com.email.service;

/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/18/2021, Monday
 **/
/**
 What this program snippet doing?
 Email Service class where actual Email sending logic implemented
 **/


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public  boolean sendEmail (String subject, String message, String to, String sender_add) {

        boolean flag = false; // Setting Flag false at start


        // variable for email host
        String host = "smtp.gmail.com";

        // Get the System properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES" + properties);

        // setting important information properties object

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465"); // default port for google smtp is 465
        properties.put("mail.smtp.ssl.enable", true);
        properties.put("mail.smtp.auth", true);


        // Step 1: Get the Session object

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender_add, "*******");
            }
        });

        session.setDebug(true); // setting debug as True

        // Step2: Compose the message

        MimeMessage m = new MimeMessage(session);
        try {
            //from email
            m.setFrom(sender_add);

            // to email
            // InternetAddress - this class represents an Internet email Address using the syntax of RFC822
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));


            // adding subject to message
            m.setSubject(subject);

            // adding body to message
            m.setText(message);


            // Step 3: Send message using Transport class

            Transport.send(m);

            System.out.println("Message sent successfully");
            flag=true;



        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return flag;
    }



}