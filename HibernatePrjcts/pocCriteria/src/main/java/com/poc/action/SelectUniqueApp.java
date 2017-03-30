package com.poc.action;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.poc.form.Student;


public class SelectUniqueApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Criteria c = session.createCriteria(Student.class);
	    Criterion crn = Restrictions.eq("id", 1);
	    
	    c.add(crn);
	    Student std = (Student) c.uniqueResult();
	    System.out.println(std.getAddress());
	    System.out.println(std.getName());
	    System.out.println(std.getCourseName());
	    System.out.println(std.getCourseFee());
	    
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();
	}
}
