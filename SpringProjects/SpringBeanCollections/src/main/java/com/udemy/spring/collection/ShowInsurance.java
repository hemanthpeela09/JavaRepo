package com.udemy.spring.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShowInsurance {
	private static final Logger log = LoggerFactory.getLogger(ShowInsurance.class);
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Insurance status = context.getBean("myInsurance", Insurance.class);
		log.info(status.showStatus());
		log.info(status.getMembers().toString());
		context.close();
	}

}
