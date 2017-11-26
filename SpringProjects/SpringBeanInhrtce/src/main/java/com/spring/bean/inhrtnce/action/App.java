package com.spring.bean.inhrtnce.action;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.inhrtnce.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        
        Employee employee = ctx.getBean("employee", Employee.class);
        //Inheriting parent class properties and displaying
        System.out.println("Employee details: Name - "+employee.getName() + "\nSsn - "+ employee.getSsn());
        System.out.println("Gender - "+ employee.getGender() + ", Id - "+ employee.getId());
    }
}
