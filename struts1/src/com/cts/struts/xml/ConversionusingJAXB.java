package com.cts.struts.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.cts.struts.action.DownloadForm;
import com.cts.struts.action.UploadForm;
import com.cts.struts.xml.Student;
import com.cts.struts.xml.Training;

public class ConversionusingJAXB{
	
	public void unmarsheller(File file) throws JAXBException 
	{
		//UNMARSHALLER XML TO JAVA	
		JAXBContext jaxbContext= JAXBContext.newInstance(Training.class);
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
		Training form= (Training) unmarshaller.unmarshal(file);
		
		//System.out.println(form.getName()+" "+form.getAge()+" "+form.getCourse()+" "+form.getClass());
		System.out.println("Institue name: "+form.getName());
		
		List<Student> students= form.getStudents();
		for (Student student : students) {
			System.out.println("Name of students: "+ student.getName()+", id:"+student.getId()+", Course:"+student.getCourse()+", Age:"+student.getAge());
			
		}
	}
	public void marsheller(File file) throws JAXBException, IOException
	{
		
		//MARSHALLER JAVA TO XML
		JAXBContext jaxbContext= JAXBContext.newInstance(Training.class);
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
		Training form= (Training) unmarshaller.unmarshal(file);
		form=new Training();
		form.setName("Oracle");
		List<Student> student1=new ArrayList<>(); 
		Student studentGen1=new Student(4, 21, "Johnny", "Oracle");
		Student studentGen2=new Student(5, 21, "Phk09", "PL/SQL");
		student1.add(studentGen1);
		student1.add(studentGen2);
		form.setStudents(student1);
		
		Marshaller marshaller = jaxbContext.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(form, new File("export.xml"));
	    marshaller.marshal(form, System.out);
	    
	    //marshaller.marshal(form,new File("export.xml"));
	    //File download=new File("C:\\Users\\416289\\Downloads\\export.xml");
	    
	    System.out.println("marshalling completed");
	    		
	    
	}
	
	

}
