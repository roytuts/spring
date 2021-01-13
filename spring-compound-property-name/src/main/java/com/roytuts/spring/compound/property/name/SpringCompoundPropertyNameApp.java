package com.roytuts.spring.compound.property.name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCompoundPropertyNameApp implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringCompoundPropertyNameApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Bar bar = applicationContext.getBean(Bar.class);

		System.out.println(bar.getFoo().getFred().getBob().getJhon());
	}

}
