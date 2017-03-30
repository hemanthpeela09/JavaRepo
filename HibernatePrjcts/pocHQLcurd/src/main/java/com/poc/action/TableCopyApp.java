package com.poc.action;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TableCopyApp {
	public static void main(String[] args)
	  {
			Configuration cfg = new Configuration();
		    cfg.configure("resources/hibernate.cfg.xml");
		    SessionFactory sf = cfg.buildSessionFactory();
		    Session session = sf.openSession();
		    String hql = "INSERT INTO NewStudent(id,name,email,address,createdDate,courseName) "
		    		+ "select s.id, s.name, s.email, s.address, s.createdDate, s.courseName from OldStudent s";
		    //Using HQL using bean classes can copy table data to new table  
		    
		    Query q = session.createQuery(hql);
		    int i = q.executeUpdate();
		    System.out.println("No of rows copied from old table to new table -> "+ i);
		    session.beginTransaction().commit();
		    session.close();
		    sf.close();
	  }
}
