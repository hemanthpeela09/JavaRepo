package com.cts.struts.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;


public class LoginForm  extends ValidatorForm 
{
	private String uname=null,pwd=null;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
		
	/*public ActionErrors validate(ActionMapping map,HttpServletRequest req){
		ActionErrors errors=new ActionErrors();
		if("".equals(getUname()) || getUname().equals(null) || "".equals(getPwd()) || getPwd().equals(null))
		{
			errors.add("uname", new ActionMessage("UnameErr.blank"));
		}
		return errors;
	}*/
	
}
