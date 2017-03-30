package com.cts.struts.action;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.chain.commands.servlet.ValidateActionForm;

import com.cts.struts.xml.ConversionusingJAXB;

public class UploadAction extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,
		    HttpServletRequest request, HttpServletResponse response)
		    throws Exception 
		    {
				UploadForm uploadForm=(UploadForm) form;
				ConversionusingJAXB jaxb=new ConversionusingJAXB();
				File temp= uploadForm.getFile();
				jaxb.unmarsheller(temp);
				
				return mapping.findForward("success");
		    }
}
