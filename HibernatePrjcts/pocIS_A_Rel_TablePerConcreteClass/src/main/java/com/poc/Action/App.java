package com.poc.Action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.poc.form.Admin;
import com.poc.form.HEmployee;
import com.poc.form.SEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	   
    	SEmployee se = new SEmployee(111, "Hemanth", "h@gmail.com", 20000, "Spring");
	    HEmployee he = new HEmployee(222, "Chaity", "c@gmail.com", 30000, 10);
	    Admin admin = new Admin(333, "Krish", "c@gmail.com", 50000, "Vizag");
    	
	    Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    session.save(se);
	    session.save(he);
	    session.save(admin);
	    
	    session.beginTransaction().commit();
	    
//	    session.evict(se);
//	    session.evict(he);
//	    session.evict(admin);
	    session.close();
	    sf.close();
	  }
}
