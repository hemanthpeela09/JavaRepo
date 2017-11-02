package com.spring.core.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.core.bean.Message;

public class creatingComponents {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Object object = beanFactory.getBean("message");
		if(object != null){
			Message message = (Message) object;
			System.out.println(message.getMessageId() + "---" + message.getMessage());
		}
		
	}
}
