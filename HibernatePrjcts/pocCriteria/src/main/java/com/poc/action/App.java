package com.poc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.poc.form.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
	  {
	    Student student = new Student();
	    student.setId(1);
	    student.setName("Hemanth");
	    student.setEmail("phk@phk.com");
	    student.setAddress("India");
	    student.setCourseName("Java");
	    student.setCourseFee(3000);
	    
	    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    student.setCreatedDate(timeStamp);
	    
	    Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    session.save(student);
	    
	    session.beginTransaction().commit();
	    
	    session.evict(student);
	    session.close();
	  }
}
