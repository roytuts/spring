package com.roytuts.spring.collection.set;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCollectionSetApp implements CommandLineRunner {

	@Value("${roytuts.set1}")
	private Set<String> strSet1;

	@Value("#{'${roytuts.set1}'.split(',')}")
	private Set<String> strSet12;

	@Value("${roytuts.set2}")
	private Set<String> strSet2;

	@Autowired
	private RoytutsSet roytutsSet;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringCollectionSetApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();

		System.out.println("Set of Strings1: " + Arrays.toString(strSet1.toArray()));

		System.out.println();

		System.out.println("Set of Strings12: " + Arrays.toString(strSet12.toArray()));

		System.out.println();

		System.out.println("Set of Strings2: " + Arrays.toString(strSet2.toArray()));

		System.out.println();

		System.out.println("Set of Configurable Strings: " + Arrays.toString(roytutsSet.getSet().toArray()));

		System.out.println();

		SpringCollectionSet springCollectionList = applicationContext.getBean(SpringCollectionSet.class);

		System.out.println("Set of XML Config Strings: " + Arrays.toString(springCollectionList.getSet().toArray()));
	}

}
