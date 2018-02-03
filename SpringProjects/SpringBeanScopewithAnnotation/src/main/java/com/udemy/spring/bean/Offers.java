package com.udemy.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("offer")
@Scope("prototype")
public class Offers {
	private String offer = "No currents offers right now!!";

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}
	@PostConstruct
	public void init(){
		System.out.println("Started Init method");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destory method called");
	}
}
