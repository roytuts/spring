package com.roytuts.spring.tx;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.roytuts.spring.tx.config.Config;
import com.roytuts.spring.tx.model.Item;
import com.roytuts.spring.tx.service.ItemService;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(Config.class);
		context.refresh();

		ItemService service = context.getBean(ItemService.class);

		System.out.println("----Available Items----");
		List<Item> items = service.getItems();
		items.forEach(i -> System.out.println(i));

		context.close();
	}

}
