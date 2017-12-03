package com.udemy.spring.webservices.SpringSOAPWS;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.udemy.courses.CourseDetails;
import com.udemy.courses.GetAllCourseDetailsRequest;
import com.udemy.courses.GetAllCourseDetailsResponse;
import com.udemy.courses.GetCourseDetailsRequest;
import com.udemy.courses.GetCourseDetailsResponse;
import com.udemy.spring.webservices.bean.Course;

@Endpoint
public class CourseDetailsEndpoint {
	
	@Autowired
	CourseDetailsService service;
	/*
	 * Creating a method for endpoint to process request and returns response
	 * Namespace: http://udemy.com/courses
	 * Request: GetCourseDetailsRequest
	 */
	
	@PayloadRoot(namespace="http://udemy.com/courses" , localPart="GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetails(@RequestPayload GetCourseDetailsRequest request) {
		Course course = service.findById(request.getId());
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		response.setCourseDetails(mapCourse(course));
		return response;
	}

	private CourseDetails mapCourse(Course course) {
		CourseDetails value = new CourseDetails();
		value.setId(course.getId());
		value.setName(course.getName());
		value.setDescription(course.getDescription());
		return value;
	}

	@PayloadRoot(namespace="http://udemy.com/courses" , localPart="GetAllCourseDetailsRequest")
	@ResponsePayload
	public GetAllCourseDetailsResponse processAllCourseDetails(@RequestPayload GetAllCourseDetailsRequest request) {
		List<Course> courses = service.findAll();
		GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
		List<CourseDetails> list = mapAllCourses(courses);
		response.getCourseDetails().addAll(list);
		return response;
		
	}

	private List<CourseDetails> mapAllCourses(List<Course> courses) {
		List<CourseDetails> list = new ArrayList<CourseDetails>();
		for(Course value: courses){
			list.add(mapCourse(value));
		}
		return list;
	}
}
