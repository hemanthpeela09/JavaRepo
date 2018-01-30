package com.udemy.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import com.udemy.spring.di.Offers;
public class CarInsurance implements Insurance {
	@Autowired
	public CarInsurance(Offers offer) {
		System.out.println(offer.showOffers());
	}
	@Override
	public String showStatus() {
		return "You have Car insurance";
	}
}
