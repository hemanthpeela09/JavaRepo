package com.udemy.spring.ioc;

import com.udemy.spring.di.Offers;

public class BikeInsruance implements Insurance {
	private String name;
	private int insuranceId;
	private int validity;
	
	public BikeInsruance(String name, int insuranceId) {
		this.name = name;
		this.insuranceId = insuranceId;
	}

	public BikeInsruance() {
		this.name = "User";
		this.insuranceId = 500;
	}


	@Override
	public String showStatus() {
		return "Hi " + name + " have Bike Insurance id "+ insuranceId;
	}

	@Override
	public String toString() {
		return "BikeInsruance [name=" + name + ", insuranceId=" + insuranceId + ", validity=" + validity + "]";
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	@Override
	public Offers getCurrentOffer() {
		// TODO Auto-generated method stub
		return null;
	}

}
