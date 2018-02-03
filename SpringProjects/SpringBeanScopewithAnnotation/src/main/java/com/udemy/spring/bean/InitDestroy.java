package com.udemy.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroy {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Offers offer = (Offers) context.getBean("offer");
		System.out.println(offer);
		context.close();
	}

}
