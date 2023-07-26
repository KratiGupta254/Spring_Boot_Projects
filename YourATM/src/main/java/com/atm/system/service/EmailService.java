package com.atm.system.service;


import java.util.Properties;

import org.springframework.stereotype.Service;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
	
	public boolean sendEmail(String to, String subject, String body) throws MessagingException
	{
		
		String from="kratiiguptaa@gmail.com";
		
		boolean f=false;
		
		String host = "smtp.gmail.com";
   
		Properties properties = System.getProperties();
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
		    protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication("kratiiguptaa@gmail.com",
		        		"wlhbtyqydspqiczd");
		    }
		});

		session.setDebug(true);

		
		MimeMessage message = new MimeMessage(session);
	       try {
			message.setFrom(from);
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setText(body);
			message.setSubject(subject);
			Transport.send(message);
			f=true;
			System.out.println("Send Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
return f;
		
	}
	
	
		


}
