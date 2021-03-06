package com.poc.action;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.poc.form.Student;

public class SelectMutipleRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Criteria c = session.createCriteria(Student.class);
	    //Criterion crn = Restrictions.gt("courseFee", 5000.0); //Returns Greater values
	    //Criterion crn = Restrictions.lt("courseFee", 5000.0); // Returns lower values
	    Criterion crn = Restrictions.between("courseFee", 3000.0,5000.0); // Return range of values in between
	    c.add(crn);
	    
	    List<Student> list = c.list();
	    for(Student std: list){
	    	System.out.println("----------------");
	    	System.out.println("   "+std.getId());
	    	System.out.println("   "+std.getName());
	    	System.out.println("   "+std.getEmail());
	    	System.out.println("   "+std.getCourseName());
	    	System.out.println("   "+std.getCourseFee());
	    }
	    
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();
	}
}
