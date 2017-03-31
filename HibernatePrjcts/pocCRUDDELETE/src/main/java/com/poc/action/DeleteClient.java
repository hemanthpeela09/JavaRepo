package com.poc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.form.Student;

/**
 * Hello world!
 *
 */
public class DeleteClient 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("resources/hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	Student st = new Student();
    	st.setId(111);
//    	st.setName("Johnny");
//    	st.setEmail("john@john.com");
//    	st.setCourse("python");
//    	st.setAddress("HYD, India");
        
//        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//        st.setCreatedDate(timeStamp);
    	
//    	int primaryKey = (Integer) s.save(st); //It will check for primary key constraint before inserting, Exception if value exist
//    	System.out.println("primaryKey value: " + primaryKey);
        s.delete(st); //If available ignore / If not exist value will be inserted No Exception will come
        
    	t.commit();
    	s.close();
    	sf.close();
    	System.out.println("Record Delete Successfully");
    }
}
