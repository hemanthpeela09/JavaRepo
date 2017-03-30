package com.poc.action;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.poc.form.Student;

public class ProjectionMultRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    Criteria c = session.createCriteria(Student.class);
	    ProjectionList plist = Projections.projectionList();
	    Projection p = Projections.property("id");
	    Projection p1 = Projections.property("name");
	    plist.add(p);
	    plist.add(p1);
	    c.setProjection(plist);
	    
	    List<Object[]> list = c.list();
	    for(Object[] obj: list){
	    	System.out.println("Result value "+ obj[0]+", "+obj[1]);
	    }
	    
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();

	}
}
