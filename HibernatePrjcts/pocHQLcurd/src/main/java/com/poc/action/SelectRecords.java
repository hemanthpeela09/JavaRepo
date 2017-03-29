package com.poc.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.poc.form.NewStudent;

public class SelectRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	    cfg.configure("resources/hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    String hql = "select id, name, email, courseName, address from NewStudent";
	    
	    Query q = session.createQuery(hql);
	    List<Object[]> list = q.list();
	    System.out.println(list.size());
	    int i = 0; 
	    for(Object[] obj : list){
	    	System.out.println("---Object "+i +" values: ");
	    	for(int j=0; obj.length>j; j++){
	    		System.out.println(">"+obj[j]);
	    	}
	    	i++;
	    }
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();
	}
}
