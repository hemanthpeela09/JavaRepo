package com.poc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.form.BookTckt;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
	  {
	    BookTckt bookTckt = new BookTckt();
	    //bookTckt.setId(1);
	    bookTckt.setName("Johnny");
	    bookTckt.setEmail("phk@phk.com");
	    bookTckt.setShowTime("2:30");
	    bookTckt.setMovieName("LOGAN");
	    
	    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    bookTckt.setBookDate(timeStamp);
	    
	    Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction t =session.beginTransaction();
	    
	    session.save(bookTckt);
	    t.commit();
	    session.close();
	    sf.close();
	    System.out.println("Insertion Completed");
	  }
}
