package com.pocDA.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.LookupDispatchAction;

import com.pocDA.form.regForm;



public class regAction extends LookupDispatchAction{
	
	@Override
	protected Map getKeyMethodMap() {
		
		Map map=new HashMap();
		
		//map.put(<bean button key name>,<method name in controller>);
		map.put("register", "empregister");//can write any method name
		map.put("update", "update");
		return map;
	}

	public ActionForward empregister(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		regForm regform=(regForm) form;
		int id=regform.getId();
		String name=regform.getName();
		String email=regform.getEmail();
		String address=regform.getAddress();
		
		System.out.println("In empregister"+id+ "--"+name+"--"+email+"--"+address);
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
		
		System.out.println("In update"+id+ "--"+name+"--"+email+"--"+address);
		return mapping.findForward("success");
	}

	
}
