package com.spring.bean.inhrtnce.action;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.inhrtnce.bean.Employee;
import com.spring.bean.inhrtnce.bean.Staff;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        
        Employee employee = ctx.getBean("employee", Employee.class);
        //Inheriting parent class properties and displaying
        System.out.println("---------Inheriting parent class properties and displaying--------");
        System.out.println("Employee details: Name - "+employee.getName() + "\nSsn - "+ employee.getSsn());
        System.out.println("Gender - "+ employee.getGender() + ", Id - "+ employee.getId());
        
        //Inherting parent class using abstract template
        System.out.println("\n---------Inherting parent class using abstract template--------");
        Staff staff = ctx.getBean("staff", Staff.class);
        System.out.println("Employee details: Name - "+staff.getName() + "\nCompany - "+ staff.getCompany());
        System.out.println("Address - "+ staff.getAddress() + ", Id - "+ staff.getId());
    }
}
