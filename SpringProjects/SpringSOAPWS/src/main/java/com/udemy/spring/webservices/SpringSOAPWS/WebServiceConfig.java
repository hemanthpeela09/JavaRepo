package com.udemy.spring.webservices.SpringSOAPWS;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

//Enable Spring webservices
@EnableWs
//Spring configuration
@Configuration
public class WebServiceConfig {
	//Message Dispatcher Servlet
	//ApplicationContext 
	//url -> /ws/*
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context){
		//Map messageDispatcherServlet to url
		MessageDispatcherServlet dispatcherServlet = new MessageDispatcherServlet();
		dispatcherServlet.setApplicationContext(context);
		dispatcherServlet.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean(dispatcherServlet, "/ws/*");
		
	}
	
	//Using schemas - course-details.xsd to generate WSDL file
	// WSDL file in /ws/courses.wsdl
	//To create wsdl we require Port type & Namespace
	//PortType - CoursePort
	//course-details.xsd
	@Bean(name="courses")
	public DefaultWsdl11Definition generateWSDL(XsdSchema schema){
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("CoursePort");
		definition.setTransportUri("http://udemy.com/courses");
		definition.setLocationUri("/ws");
		definition.setSchema(schema);
		return definition;
		
	}
	
	@Bean
	public XsdSchema coursesSchema(){
		return new SimpleXsdSchema(new ClassPathResource("course-details.xsd"));
	}
}
