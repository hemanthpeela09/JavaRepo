package com.spring.core.ioc.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.core.bean.Message;

public class BeanFactoryCntnr {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Object object = beanFactory.getBean("message");
		//Gets generic object need to type cast
		if(object != null){
			Message message = (Message) object;
			System.out.println(message.getMessageId() + "---" + message.getMessage());
		}
		
		System.out.println("----------------------------------------");
		//Instead of type casting to get bean class
		Message msgObj1 = beanFactory.getBean("message", Message.class);
		System.out.println(msgObj1.getMessageId() + "---" + msgObj1.getMessage());
		
		System.out.println("----------------------------------------");
		String[] alias = beanFactory.getAliases("message");
		for(String name: alias){
			System.out.println("Alaises present "+ name);
		}
		
		System.out.println("----------------------------------------");
		Message msgObj2 = beanFactory.getBean(Message.class);
		System.out.println(msgObj2.getMessageId() + "---" + msgObj2.getMessage());
		
		System.out.println("----------------------------------------");
		Class<?> cls= beanFactory.getType("message");
		System.out.println(cls);
		
		System.out.println("----------------------------------------");
		System.out.println(beanFactory.isSingleton("message"));
		System.out.println(beanFactory.isPrototype("message"));
	}
}
