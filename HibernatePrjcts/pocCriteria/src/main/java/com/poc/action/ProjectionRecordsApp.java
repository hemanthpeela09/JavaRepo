package com.poc.action;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.poc.form.Student;

public class ProjectionRecordsApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Criteria c = session.createCriteria(Student.class);
	    Projection p = Projections.property("name");
	    c.setProjection(p);
	    List<Object[]> list = c.list();
	    for(Object obj: list){
	    	System.out.println("Result value "+ obj);
	    }
	    
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();

	}

}
