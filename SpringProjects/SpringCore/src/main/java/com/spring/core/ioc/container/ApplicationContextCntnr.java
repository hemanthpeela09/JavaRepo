package com.spring.core.ioc.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.core.bean.Employee;

public class ApplicationContextCntnr {

	public static void main(String[] args) {
		
		//Reading XML file from class path
		ApplicationContext context = new ClassPathXmlApplicationContext("EmpBean.xml");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee.getEmpId()+ "-----" +employee.getEmpName());
		
		((AbstractApplicationContext) context).close(); 
		
		//Read XML file from File Path
		ApplicationContext context1 = new FileSystemXmlApplicationContext("resources/EmployeeBean.xml");
		Employee employee1 = context1.getBean(Employee.class);
		System.out.println(employee1.getEmpId()+ "-----" +employee1.getEmpName());
		((AbstractApplicationContext) context1).close(); 
		
	}

}
