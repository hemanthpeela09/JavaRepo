package com.spring.core.ioc.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.bean.Student;


public class BeanScopeAnnotation {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student std = context.getBean(Student.class);
		std.setStdId(1252);
		std.setStdName("Marvel");
		
		System.out.println(std.getStdId() +"---"+ std.getStdName());
		
		Student std1 = context.getBean(Student.class);
		System.out.println(std1.getStdId() +"---"+ std1.getStdName());
	}
	
}
