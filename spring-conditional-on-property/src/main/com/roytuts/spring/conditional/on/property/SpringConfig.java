package com.roytuts.spring.conditional.on.property;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	@ConditionalOnProperty(prefix = "module", value = "enabled"/*, havingValue = "false" , matchIfMissing = true */)
	public SpringService springService() {
		return new SpringService();
	}

}
