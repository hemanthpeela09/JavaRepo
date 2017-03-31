package com.poc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.form.UserForm;
import com.poc.form.UserResult;

public class GetResult extends Action {
	
	SessionFactory sf;
    
  @Override
  public ActionForward execute(ActionMapping mapping, 
          ActionForm form, HttpServletRequest request,
          HttpServletResponse response) throws Exception {
      
	  //UserForm userForm = (UserForm) form;
	  
	  configureHibernate();
	  
	  
      return mapping.findForward("success");
  }
  
  public void configureHibernate() {
	  Configuration cfg = new Configuration();
	  cfg.configure("resources/hibernate.cfg.xml");
	  sf = cfg.buildSessionFactory();
	  Session session = sf.openSession();
	  Query q = session.createQuery("from UserForm");
	  int i=1;
	  int j=4;
	  UserResult result= new UserResult();
	  
	  for(int k=0; k<q.list().size(); k++){
		  q.setFirstResult(i);
		  q.setMaxResults(j);
		  List<UserForm> list = (List<UserForm>) q.list();
		  result.setList(list);
		  i= i+4;
		  j= j+4;
	  }
	  result.setMin(i);
	  result.setMax(j);
	  	
	    session.close();
	    sf.close();
  }
  
}
