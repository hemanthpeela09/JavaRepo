package com.poc.Action;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.form.Course;
import com.poc.form.Faculty;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	   
    	Course course = new Course();
    	course.setCid(1);
    	course.setCname("Hibernates");
    	course.setFee(5000);
    	
    	Course course1 = new Course();
    	course1.setCid(2);
    	course1.setCname("Spring");
    	course1.setFee(10000);
    	
    	Course course2 = new Course();
    	course2.setCid(3);
    	course2.setCname("Python");
    	course2.setFee(7000);
    	
    	Set<Course> setCourse = new HashSet<Course>();
    	setCourse.add(course);
    	setCourse.add(course1);
    	setCourse.add(course2);

    	Set<Course> setCourse1 = new HashSet<Course>();
    	setCourse1.add(course);
    	setCourse1.add(course1);

    	
    	Faculty faculty = new Faculty();
    	faculty.setFid(1);
    	faculty.setFname("Hemanth");
    	faculty.setYearex(4);
    	faculty.setCourses(setCourse1);
    	
    	Faculty faculty1 = new Faculty();
    	faculty1.setFid(2);
    	faculty1.setFname("Krish");
    	faculty1.setYearex(8);
    	faculty1.setCourses(setCourse);
    	
    	
	    Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Transaction tran = session.beginTransaction();
	    
	    session.saveOrUpdate(faculty);
	    session.saveOrUpdate(faculty1);
	    
	    tran.commit();
	    
	    session.close();
	    sf.close();
	    
	    System.out.println("Many to Many  done");
	  }
}
