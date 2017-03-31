package com.cts.pocda.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DownloadAction;

public class downloadfileAction extends DownloadAction{
	


	@Override
	protected StreamInfo getStreamInfo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		String filename= request.getParameter("filename");
		StreamInfo info=null;
		if(filename.contains("book"))
		{
			File file= new File("C:/Users/416289/Desktop/Temp/strutsbook.docx");
			info= new FileStreamInfo("application/octet-stream", file);

			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment;filename=newbook.txt");
		}
		else if(filename.contains("images"))
		{
			File file= new File("C:/Users/416289/Desktop/Temp/Capture.png");
			info= new FileStreamInfo("image/png", file);

			response.setContentType("image/png");
			response.setHeader("Content-Disposition", "attachment;filename=image.png");
		}
		/*else 
		{
			
		}*/
			
		
		return info;
	}

}
