package com.udemy.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarInsruance implements Insurance {
	@Autowired
	Offers currentOffer;
	@Override
	public String showStatus() {
		return "You have Car insurance";
	}
	@Override
	public Offers getCurrentOffer() {
		return currentOffer;
	}
}
