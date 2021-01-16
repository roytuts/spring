package com.roytuts.spring.collection.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCollectionMapApp implements CommandLineRunner {

	@Autowired
	private SpringCollectionMap collectionMap;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringCollectionMapApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		collectionMap.getMap().forEach((k, v) -> System.out.println(k + " -> " + v));

		System.out.println("========================================================");

		RoytutsInfoMap roytutsInfoMap = applicationContext.getBean(RoytutsInfoMap.class);

		roytutsInfoMap.getMap().forEach((k, v) -> System.out.println(k + " -> " + v));
	}

}
