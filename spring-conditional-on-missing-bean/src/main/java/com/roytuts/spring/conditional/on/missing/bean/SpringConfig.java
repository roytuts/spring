package com.roytuts.spring.conditional.on.missing.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	// @ConditionalOnMissingBean
	// @ConditionalOnMissingBean(type = "SpringService")
	// @ConditionalOnMissingBean(value = SpringService.class)
	// @ConditionalOnMissingBean(name = "springService")
	// @ConditionalOnMissingBean(search = SearchStrategy.CURRENT)
	// @ConditionalOnMissingBean(annotation = Service.class)
	// @ConditionalOnMissingBean(ignored = { SpringService.class,
	// AnotherSpringService.class })
	// @ConditionalOnMissingBean(ignoredType = { "SpringService",
	// "AnotherSpringService" })
	@ConditionalOnMissingBean(parameterizedContainer = AnotherSpringService.class)
	public SpringService springService() {
		return new SpringService();
	}

	@Bean
	public AnotherSpringService<RequiredBean> anotherSpringService() {
		return new AnotherSpringService<RequiredBean>();
	}

}
