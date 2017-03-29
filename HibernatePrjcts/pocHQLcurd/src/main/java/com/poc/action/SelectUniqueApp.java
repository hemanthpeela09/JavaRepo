package com.poc.action;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.poc.form.NewStudent;

public class SelectUniqueApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    String hql = "from NewStudent where id = 1";
	    
	    Query q = session.createQuery(hql);
	    NewStudent student = (NewStudent) q.uniqueResult();
	    System.out.println(student.getName());
	    System.out.println(student.getEmail());
	    System.out.println(student.getAddress());
	    System.out.println(student.getCourseName());
	    System.out.println(student.getCreatedDate());
	    
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();
	}
}
