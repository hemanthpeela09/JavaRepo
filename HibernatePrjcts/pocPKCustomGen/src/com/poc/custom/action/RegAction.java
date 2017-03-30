package com.poc.custom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.custom.form.UserForm;
import com.poc.custom.form.UserVO;

public class RegAction extends Action {
	
	SessionFactory sf;
    
  @Override
  public ActionForward execute(ActionMapping mapping, 
          ActionForm form, HttpServletRequest request,
          HttpServletResponse response) throws Exception {
      
	  UserForm userForm = (UserForm) form;
	  
	  configureHibernate(userForm);
	  
	  
      return mapping.findForward("success");
  }
  
  public void configureHibernate(UserForm userForm) {
	  Configuration cfg = new Configuration();
	  cfg.configure("resources/hibernate.cfg.xml");
	  sf = cfg.buildSessionFactory();
	  Session session = sf.openSession();
	  Transaction t =session.beginTransaction();
	    
	    String actno = (String) session.save(userForm);
	    t.commit();
	    session.close();
	    sf.close();
	    System.out.println("Registration Completed Account no is: "+ actno);
	    userForm.setAcctno(actno);
  }
  
}
