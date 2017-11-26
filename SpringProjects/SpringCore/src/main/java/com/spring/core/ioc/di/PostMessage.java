package com.spring.core.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostMessage {

	public static void main(String[] args) {
		//Dependency Injection using Constructor
		AbstractApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		Communication comm = ctxt.getBean(Communication.class);
		comm.communicate();
		ctxt.close();
		
		//Dependency Injection using Setter Method
		AbstractApplicationContext ctxt1 = new ClassPathXmlApplicationContext("beans.xml");
		SetCommunication comm1 = ctxt1.getBean(SetCommunication.class);
		comm1.communicate();
		ctxt1.close();
		
		
	}

}
