package com.udemy.spring.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShowInsurance {
	private static final Logger log = LoggerFactory.getLogger(ShowInsurance.class);
	
	public static void main(String[] args) { 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Insurance status1 = context.getBean("myInsurance", Insurance.class);
		log.info(status1.showStatus());
		context.close();
	}

}
