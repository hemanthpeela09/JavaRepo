package com.udemy.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	private static final Logger log = LoggerFactory.getLogger(User.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Offers offer1 = (Offers) context.getBean("offer");
		log.info(offer1.getOffer());
		offer1.setOffer("New offer coming on feb14!!");
		log.info("Offer 1 : {}",offer1.getOffer());
		
		Offers offer2 = (Offers) context.getBean("offer");
		log.info("Offer 2 : {}",offer2.getOffer());
		
		log.info("To check memory location of beans");
		log.info("Offer 1 : {}", offer1);
		log.info("Offer 2 : {}", offer2);
		context.close();
		
		
	}
}
