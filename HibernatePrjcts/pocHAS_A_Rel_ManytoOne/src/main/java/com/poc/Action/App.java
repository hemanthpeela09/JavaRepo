package com.poc.Action;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.form.Actor;
import com.poc.form.Movies;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	   
    	Actor actor = new Actor();
    	actor.setAid(2);
    	actor.setName("Pawan Kalyan");
    	
    	Movies movies1 = new Movies();
    	movies1.setMid(4);
    	movies1.setName("GS");
    	movies1.setActor(actor);
    	
    	Movies movies2 = new Movies();
    	movies2.setMid(5);
    	movies2.setName("Katamarayudu");
    	movies1.setActor(actor);
    	
    	Set<Movies> set = new HashSet<Movies>();
    	set.add(movies1);
    	set.add(movies2);
    	
    	
	    Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction tran = session.beginTransaction();
	    
	    session.save(movies1);
	    session.save(movies2);
	    session.save(actor);
	  
	    
	    
	    tran.commit();
	    
	    session.close();
	    sf.close();
	    
	    System.out.println("Many to One  done");
	  }
}
