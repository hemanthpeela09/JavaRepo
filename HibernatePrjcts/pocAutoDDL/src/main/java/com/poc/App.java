package com.poc;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//To run insert date into student table run this class 
    	
        Student student = new Student();
        student.setId(01);
        student.setName("Hemanth");
        student.setEmail("phk@phk.com");
        student.setAddress("India");
        
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        student.setCreatedDate(timeStamp);
        
        //Student Object state is Transient
        
        //Configuring Hibernate
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.save(student);
        
        //Student Object state is Persistent
        session.beginTransaction().commit();
        //Student Object stored in DB
        
        //Student Object state is removed from Persistent
        session.evict(student);
        //Garbage collector will collect Student Object
        
        
    }
}
