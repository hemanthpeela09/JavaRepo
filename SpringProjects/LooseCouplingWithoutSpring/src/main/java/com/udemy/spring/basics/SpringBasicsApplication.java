package com.udemy.spring.basics;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {
	
	public static void main(String[] args) {
		BinarySearchImpl search = new BinarySearchImpl(new BubbleSortAlgm());
		int result = search.binarySearch(new int [] {2,3,5,6}, 2);
		System.out.println("binarySearch result - "+result);
		
		//SpringApplication.run(SpringBasicsApplication.class, args);
	}
}
