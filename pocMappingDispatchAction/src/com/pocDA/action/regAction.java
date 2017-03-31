package com.pocDA.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import com.pocDA.form.regForm;



public class regAction extends MappingDispatchAction{

	public ActionForward register(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		regForm regform=(regForm) form;
		int id=regform.getId();
		String name=regform.getName();
		String email=regform.getEmail();
		String address=regform.getAddress();
		
		System.out.println("In register method"+id+ "--"+name+"--"+email+"--"+address);
		return mapping.findForward("success");
	}
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		regForm regform=(regForm) form;
		int id=regform.getId();
		String name=regform.getName();
		String email=regform.getEmail();
		String address=regform.getAddress();
		
		System.out.println("In update method"+id+ "--"+name+"--"+email+"--"+address);
		return mapping.findForward("success");
	}
	
}
