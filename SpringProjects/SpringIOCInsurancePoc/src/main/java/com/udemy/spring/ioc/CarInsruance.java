package com.udemy.spring.ioc;

public class CarInsruance implements Insurance {
	private int validity;
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	@Override
	public String showStatus(){
		return "You have Car insurance";
	}
}
