package com.poc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.poc.form.OldStudent;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
	  {
	    OldStudent oldStudent = new OldStudent();
	    oldStudent.setId(1);
	    oldStudent.setName("Hemanth");
	    oldStudent.setEmail("phk@phk.com");
	    oldStudent.setAddress("India");
	    oldStudent.setCourseName("Java");
	    
	    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    oldStudent.setCreatedDate(timeStamp);
	    
	    Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    session.save(oldStudent);
	    
	    session.beginTransaction().commit();
	    
	    session.evict(oldStudent);
	    session.close();
	  }
}
