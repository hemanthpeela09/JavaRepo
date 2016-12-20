package com.cts.metlife.training;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	
	  @XmlAttribute	
	  private int id;
	  
	  private int age;
	  private String name;
	  private String course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student()
	{}
	public Student(int id,int age,String name,String course) {
		super();
		this.age=age;
		this.id=id;
		this.name=name;
		this.course=course;
	}  
	  
}
