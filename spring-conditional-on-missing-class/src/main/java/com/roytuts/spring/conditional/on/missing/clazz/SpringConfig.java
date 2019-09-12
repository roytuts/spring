package com.roytuts.spring.conditional.on.missing.clazz;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingClass(value = "com.roytuts.spring.conditional.on.missing.clazz.MissingClass")
public class SpringConfig {

	@Bean
	public SpringService springService() {
		return new SpringService();
	}

}
