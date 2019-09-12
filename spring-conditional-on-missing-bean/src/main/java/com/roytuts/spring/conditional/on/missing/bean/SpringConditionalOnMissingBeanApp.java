package com.roytuts.spring.conditional.on.missing.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConditionalOnMissingBeanApp implements CommandLineRunner {

	@Autowired
	private SpringService springService;

	public static void main(String[] args) {
		SpringApplication.run(SpringConditionalOnMissingBeanApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring service fully qualified class name: " + springService.getClass());
	}

}
