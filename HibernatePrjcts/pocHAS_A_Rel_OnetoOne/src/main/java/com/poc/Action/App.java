package com.poc.Action;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.form.Vote;
import com.poc.form.Voter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	   
    	Voter voter = new Voter();
    	voter.setVid(111);
    	voter.setVname("Hemanth");
    	voter.setVage(25);
    	
    	Vote vote = new Vote();
    	vote.setPname("BJP");
    	vote.setCdate(new Date());
    	vote.setVoter(voter);
    	
	    Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction tran = session.beginTransaction();
	    
	    session.save(voter);
	    session.save(vote);
	    
	    tran.commit();
	    
	    session.close();
	    sf.close();
	    
	    System.out.println("One to One  done");
	  }
}
