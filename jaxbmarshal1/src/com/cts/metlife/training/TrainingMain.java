package com.cts.metlife.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class TrainingMain {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		
	//***********START****************************	
	//UNMARSHALLER XML TO JAVA	
	JAXBContext jaxbContext= JAXBContext.newInstance(Training.class);
	Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
	Training form= (Training) unmarshaller.unmarshal(new File("student.xml"));
	
	//System.out.println(form.getName()+" "+form.getAge()+" "+form.getCourse()+" "+form.getClass());
	System.out.println("Institue name: "+form.getName());
	
	List<Student> students= form.getStudents();
	for (Student student : students) {
		System.out.println("Name of students: "+ student.getName()+", id:"+student.getId()+", Course:"+student.getCourse()+", Age:"+student.getAge());
		
	}
	//***********************END***************************
	
	//************************START***********************
	//MARSHALLER JAVA TO XML
	
	form=new Training();
	form.setName("Oracle");
	List<Student> student1=new ArrayList<>(); 
	Student studentGen1=new Student(4, 24, "Johnny", "Oracle");
	Student studentGen2=new Student(5, 24, "Phk09", "PL/SQL");
	student1.add(studentGen1);
	student1.add(studentGen2);
	form.setStudents(student1);
	
	Marshaller marshaller = jaxbContext.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	//marshaller.marshal(form, new File("C:\\Users\\416289\\Desktop\\Observation\\Projects Backup\\Downloads\\export.xml"));
    marshaller.marshal(form, new File("student.xml"));
    //marshaller.marshal(form, System.out);
    
    System.out.println("marshalling completed");   
	
	//******************END********************************
}
}

