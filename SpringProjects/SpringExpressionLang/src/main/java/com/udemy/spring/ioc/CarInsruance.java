package com.udemy.spring.ioc;

import com.udemy.spring.di.Offers;

public class CarInsruance implements Insurance {
	private int validity;
	private Offers currentOffer;
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
	public Offers getCurrentOffer() {
		return currentOffer;
	}
	public void setCurrentOffer(Offers currentOffer) {
		this.currentOffer = currentOffer;
	}
}
