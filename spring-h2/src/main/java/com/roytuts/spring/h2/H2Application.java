package com.roytuts.spring.h2;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roytuts.spring.h2.jdbc.model.UserDetail;
import com.roytuts.spring.h2.jdbc.service.UserDetailService;
import com.roytuts.spring.h2.jdbc.service.impl.UserDetailServiceImpl;

public class H2Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		UserDetailService service = ctx.getBean("userDetailService", UserDetailServiceImpl.class);

		List<UserDetail> userDetails = service.getAllUserDetail();
		System.out.println("All User Details:");
		for (UserDetail userDetail : userDetails) {
			System.out.println(userDetail);
		}

		System.out.println();

		UserDetail userDetail = service.getUserDetail(7);
		System.out.println("User Detail: " + userDetail);

		ctx.close();

	}

}
