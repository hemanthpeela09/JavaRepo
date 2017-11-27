package com.udemy.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl search = ctx.getBean(BinarySearchImpl.class);
		int result = search.binarySearch(new int [] {2,3,5,6}, 2);
		System.out.println("binarySearch result - "+result);
	}
}
