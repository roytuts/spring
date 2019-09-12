package com.roytuts.spring.conditional.on.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	// @ConditionalOnBean(value = RequiredBean.class)
	// @ConditionalOnBean(name = "RequiredBean")
	// @ConditionalOnBean(name = { "requiredBean", "anotherRequiredBean" })
	// @ConditionalOnBean(type = "com.roytuts.spring.conditional.bean.RequiredBean")
	public SpringService springService() {
		return new SpringService();
	}

}
