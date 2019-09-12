package com.roytuts.spring.email;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.roytuts.spring.mail.config.SpringEmailConfig;
import com.roytuts.spring.mail.service.EmailService;

public class EmailServiceTest {

	private EmailService emailService;

	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(SpringEmailConfig.class);
		context.refresh();

		emailService = context.getBean(EmailService.class);

		context.close();
	}

	@Test
	public void testSendEmail() {
		final String[] addresses = new String[] { "<recipient's gmail address>@gmail.com" };
		emailService.sendEmail("<your gmail address>@gmail.com", "How are you ?", "Hello Dear, How are you ?", addresses);
	}

}
