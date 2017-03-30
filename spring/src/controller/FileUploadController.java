package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import form.FileUpload;

@Controller
public class FileUploadController{
	private String saveDirectory = "D:/Upload/";
	private static final int BUFFER_SIZE = 4096;
 
	 @RequestMapping(value = "/fileUploadForm", method = RequestMethod.POST)
	protected ModelAndView onSubmit( @ModelAttribute("FileUpload") FileUpload uploadForm
			, ModelMap model)
		throws Exception {
		 System.out.println(uploadForm.getClass());
		 
		 MultipartFile multipartFile = (MultipartFile) uploadForm.getFile();
		 
		 multipartFile.transferTo(new File(saveDirectory + multipartFile.getOriginalFilename()));
		 
			String fileName="";			
			if(multipartFile!=null){
				fileName = multipartFile.getOriginalFilename();
				//do whatever you want
			}
		 return new ModelAndView("fileuploaded","fileName",fileName);
	 }
	 
	 @RequestMapping(value = "/files", method = RequestMethod.GET)
	 public void getFile(HttpServletRequest request, 
			    HttpServletResponse response)
	     {
	     try {
	    	 String fileName = request.getParameter("filename");
	    	 File downloadFile = new File(saveDirectory + fileName);
	    	 System.out.println("File Download : " + downloadFile.getAbsolutePath());
	    	 FileInputStream inputStream = new FileInputStream(downloadFile);
	         
	               // set content attributes for the response
	         response.setContentType("application/octet-stream");
	         response.setContentLength((int) downloadFile.length());
	  
	         // set headers for the response
	         String headerKey = "Content-Disposition";
	         String headerValue = String.format("attachment; filename=\"%s\"",
	                 downloadFile.getName());
	         response.setHeader(headerKey, headerValue);
	  
	         // get output stream of the response
	         OutputStream outStream = response.getOutputStream();
	  
	         byte[] buffer = new byte[BUFFER_SIZE];
	         int bytesRead = -1;
	  
	         // write bytes read from the input stream into the output stream
	         while ((bytesRead = inputStream.read(buffer)) != -1) {
	             outStream.write(buffer, 0, bytesRead);
	         }
	  
	         inputStream.close();
	         outStream.close();
	         
	     } catch (IOException ex) {
	       System.out.println("Error writing file to output stream.");
	       throw new RuntimeException("IOError writing file to output stream");
	     }

	 }
}
