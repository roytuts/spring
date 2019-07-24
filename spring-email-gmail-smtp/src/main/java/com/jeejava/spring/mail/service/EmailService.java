package com.jeejava.spring.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private MailSender mailSender;

	public void sendEmail(final String fromEmail, final String subject, final String message,
			final String[] emailAddresses) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(fromEmail);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setTo(emailAddresses);
		simpleMailMessage.setText(message);
		try {
			mailSender.send(simpleMailMessage);
			System.out.println("Email sending complete.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
