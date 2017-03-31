package com.cts.ems.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action 
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		LoginForm login= (LoginForm) form;
		String uname=login.getUname();
		String pwd=login.getPwd();
		String role=login.getRole();
		
		ActionForward forward=mapping.findForward("success");
		
		if(role=="admin")
			forward=mapping.findForward("adminsuccess");
		if(role=="employee")
			forward=mapping.findForward("employeesuccess");
		if(role=="user")
			forward=mapping.findForward("usersuccess");
		
			
		return forward;
	}
}
