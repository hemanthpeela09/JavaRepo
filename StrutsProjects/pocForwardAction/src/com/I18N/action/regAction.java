package com.I18N.action;

import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class regAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String language=request.getParameter("language");
		Locale locale=new Locale(language);
		
		HttpSession session=request.getSession();
		session.setAttribute("org.apache.struts.action.LOCALE", locale);
		
		
		return mapping.findForward("index");
	}
}
