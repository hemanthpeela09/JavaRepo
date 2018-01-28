package com.udemy.spring.ioc;

import com.udemy.spring.di.Conditions;
import com.udemy.spring.di.Offers;

public class CarInsruance implements Insurance {
	private Offers currentOffer;
	private Conditions cond;
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
	public Conditions getCond() {
		return cond;
	}
	public void setCond(Conditions cond) {
		this.cond = cond;
	}
}
