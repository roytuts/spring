package com.roytuts.spring.collection.list;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCollectionListApp implements CommandLineRunner {

	@Value("${roytuts.list}")
	private String[] strArray;

	@Value("${blog.roytuts.list}")
	private List<String> strList;

	@Value("#{'${roytuts.list}'.split(',')}")
	private List<String> strList2;

	@Autowired
	private RoytutsList roytutsList;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringCollectionListApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Array of Strings: " + Arrays.toString(strArray));

		System.out.println();

		System.out.println("List of Strings: " + Arrays.toString(strList.toArray()));

		System.out.println();

		System.out.println("List of Strings2: " + Arrays.toString(strList2.toArray()));

		System.out.println();

		System.out.println("List of Configurable Strings: " + Arrays.toString(roytutsList.getList().toArray()));

		System.out.println();

		SpringCollectionList springCollectionList = applicationContext.getBean(SpringCollectionList.class);

		System.out.println("List of XML Config Strings: " + Arrays.toString(springCollectionList.getList().toArray()));
	}

}
