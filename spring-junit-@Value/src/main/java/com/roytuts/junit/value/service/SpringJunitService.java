package com.roytuts.junit.value.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SpringJunitService {

	@Value("${security.key}")
	private String securityKey;

	public void updateValue() {
		System.out.println(securityKey);
	}

}
