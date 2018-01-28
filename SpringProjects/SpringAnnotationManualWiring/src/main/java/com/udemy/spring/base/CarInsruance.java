package com.udemy.spring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udemy.spring.di.Conditions;
import com.udemy.spring.di.Offers;
public class CarInsruance implements Insurance {
	private Offers offer;
	@Autowired
	public CarInsruance(Offers offer) {
		this.offer = offer;
		System.out.println("Diwali offer is going on");
	}
	@Override
	public String showStatus() {
		return "You have Car insurance";
	}
}
