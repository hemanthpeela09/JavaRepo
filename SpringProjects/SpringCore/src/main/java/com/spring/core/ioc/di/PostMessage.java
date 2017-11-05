package com.spring.core.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostMessage {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		Communication comm = ctxt.getBean(Communication.class);
		comm.communicate();
		ctxt.close();
		
		
	}

}
