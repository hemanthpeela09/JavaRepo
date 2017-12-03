package com.udemy.spring.webservices.SpringSOAPWS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.udemy.spring.webservices.bean.Course;

@Component
public class CourseDetailsService {
	private static List<Course> courses = new ArrayList<>();
	
	static{
		Course course = new Course(1, "Spring MVC", "By Ranga");
		courses.add(course);
		
		Course course1 = new Course(2, "Struts MVC", "By Naveen");
		courses.add(course1);
		
		Course course2 = new Course(3, "Xcode", "By Devslopes");
		courses.add(course2);
		
		Course course3 = new Course(4, "Spring boot", "By Udemy");
		courses.add(course3);
	}
	
	public Course findById(int id){
		for(Course value: courses){
			if(value.getId() == id){
				return value;
			}
		}
		return null;
	}
	
	public List<Course> findAll(){
		return courses;
	}
	
	public int deleteById(int id){
		Iterator<Course> iterator = courses.iterator();
		while(iterator.hasNext()){
			Course value = iterator.next();
			if(value.getId() == id){
				iterator.remove();
				return 1;
			}
		}
		return 0;
	}
}
