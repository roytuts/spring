package com.jeejava.spring.conditional.on.expression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnExpression("#{T(com.jeejava.spring.conditional.on.expression.SpEL).getHello() eq 'hello'}")
@ConditionalOnExpression("#{T(com.jeejava.spring.conditional.on.expression.SpEL).getHello()?.equals('hello')}")
//@ConditionalOnExpression("#{T(java.lang.Math).random() gt 0}")
class SpringConfig {

	@Bean
	public Module module() {
		return new Module();
	}

}
