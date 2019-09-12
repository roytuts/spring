package com.roytuts.junit.value.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(MockitoJUnitRunner.class)
public class SpringJunitValueTest {

	@Spy
	private final SpringJunitService springJunitService = new SpringJunitService();

	@Before
	public void setUp() {
		ReflectionTestUtils.setField(springJunitService, "securityKey", "it's a security key");
	}

	@Test
	public void testUpdateUser() throws Exception {
		springJunitService.updateValue();
		Mockito.verify(springJunitService, Mockito.times(1)).updateValue();
	}

}
