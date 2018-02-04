package com.udemy.spring.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShowInsurance {
	private static final Logger log = LoggerFactory.getLogger(ShowInsurance.class);
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Insurance status1 = context.getBean("myInsurance", Insurance.class);
		log.info(status1.showStatus());
		log.info(status1.getCurrentOffer().showOffers());
		log.info("valid till {}", status1.getValidity());
		context.close();
	}

}
