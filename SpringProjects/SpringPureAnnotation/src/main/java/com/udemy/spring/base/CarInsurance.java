package com.udemy.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("myInsurance")
public class CarInsurance implements Insurance {
	 public CarInsurance() {
	}
	@Autowired
	public CarInsurance(Offers offer) {
		System.out.println(offer.showOffers());
	}
	@Override
	public String showStatus() {
		return "You have Car insurance";
	}
}
