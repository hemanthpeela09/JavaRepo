package com.poc;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreatingTableTest {

	public static void main(String[] args) {
		// TO create table run this mail class
		
		//Configuring Hibernate
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        cfg.buildSessionFactory();
        
        //SessionFactory sessionFactory = cfg.buildSessionFactory();
        //sessionFactory.close();
        //TO delete DB tables is we use sessionFactory.close();
        
        
        

	}

}
