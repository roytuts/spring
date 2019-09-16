package com.roytuts.spring.service.layer.bean.validation.config;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.roytuts.spring.service.layer.bean.validation")
public class MvcConfig {

	@Bean
	public Validator validator() {
		return new LocalValidatorFactoryBean();
	}

}
