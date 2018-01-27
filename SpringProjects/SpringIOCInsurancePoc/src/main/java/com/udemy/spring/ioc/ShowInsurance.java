package com.udemy.spring.ioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShowInsurance {
	private static final Logger log = LoggerFactory.getLogger(ShowInsurance.class);
	
	public static void main(String[] args) {
		//Typical Simple Object creating and getting status
		
		/*Insurance status = new CarInsruance();
		System.out.println(status.showStatus());
		
		Insurance bstatus = new BikeInsruance();
		System.out.println(bstatus.showStatus());*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		/*Insurance status = context.getBean("myInsurance", Insurance.class);
		log.info(status.showStatus());
		log.info("valid till {}", status.getValidity());
		context.close();*/
		
		Insurance status1 = context.getBean("myInsurance1", Insurance.class);
		log.info(status1.showStatus());
		log.info(status1.getCurrentOffer().showOffers());
		log.info("valid till {}", status1.getValidity());
		context.close();
	}

}
