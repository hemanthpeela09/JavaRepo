package com.udemy.spring.bean;

public class Offers {
	private String status = "No currents offers right now!!";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void start(){
		System.out.println("Started Init method");
	}
	public void end(){
		System.out.println("Destory method called");
	}
}
