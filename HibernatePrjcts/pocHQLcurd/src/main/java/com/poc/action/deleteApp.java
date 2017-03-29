package com.poc.action;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class deleteApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    String hql = "delete NewStudent where id = 10";
	    
	    Query q = session.createQuery(hql);
	    int i = q.executeUpdate();
	    System.out.println("Update rows in table -> "+ i);
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();
	}
}
