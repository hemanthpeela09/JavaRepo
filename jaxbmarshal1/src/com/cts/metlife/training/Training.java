package com.cts.metlife.training;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Training {

  private String name;
  @XmlElement(name="student")
  private List<Student> students;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}

public Training() {}

public Training(String name,List students) {
	this.name=name;
	this.students=students;
}
}
