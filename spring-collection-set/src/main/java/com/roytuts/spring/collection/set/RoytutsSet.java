package com.roytuts.spring.collection.set;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration // Or @Component
@ConfigurationProperties("site.roytuts")
public class RoytutsSet {

	private Set<String> set;

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

}
