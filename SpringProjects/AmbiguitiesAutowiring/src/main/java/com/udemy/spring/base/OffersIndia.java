package com.udemy.spring.base;

import org.springframework.stereotype.Component;

@Component("offersIndia")
public class OffersIndia implements Offers  {
	@Override
	public String getOffers() {
		return "Diwali offer is going on";
	}

}
