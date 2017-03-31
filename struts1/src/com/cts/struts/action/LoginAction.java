package com.cts.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

import com.cts.struts.action.LoginForm;



public class LoginAction extends Action
{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
		    HttpServletRequest request, HttpServletResponse response)
		    throws Exception 
		    {
				
		        LoginForm loginForm=(LoginForm)form;

		       	      
		        if(!loginForm.getUname().equalsIgnoreCase("hemanth") || !loginForm.getPwd().equals("123"))
		        {
		            return mapping.findForward("failure");
		        }
		        else
		            return mapping.findForward("success");
		        //return mapping.findForward("success");
		    }
}

	

