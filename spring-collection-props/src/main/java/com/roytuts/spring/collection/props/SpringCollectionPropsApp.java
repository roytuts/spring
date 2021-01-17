package com.roytuts.spring.collection.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCollectionPropsApp implements CommandLineRunner {

	@Autowired
	private SpringCollectionProps collectionMap;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringCollectionPropsApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		collectionMap.getProps().forEach((k, v) -> System.out.println(k + " -> " + v));

		System.out.println("========================================================");

		RoytutsInfoProps roytutsInfoMap = applicationContext.getBean(RoytutsInfoProps.class);

		roytutsInfoMap.getProps().forEach((k, v) -> System.out.println(k + " -> " + v));
	}

}
