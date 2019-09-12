package com.roytuts.spring.conditional.on.clazz;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass(name = "com.roytuts.spring.conditional.on.clazz.RequiredClass")
@ConditionalOnClass(value = RequiredClass.class)
public class SpringConfig {

	@Bean
	public SpringService springService() {
		return new SpringService();
	}

}
