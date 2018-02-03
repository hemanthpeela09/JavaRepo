package com.udemy.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarInsruance implements Insurance {
	
	@Autowired
	@Qualifier("offersUS") 
	Offers currentOffer;
	
	@Override
	public String showStatus() {
		return "You have Car insurance";
	}

	public Offers getCurrentOffer() {
		return currentOffer;
	}

}
