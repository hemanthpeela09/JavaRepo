package com.udemy.spring.base;

import org.springframework.stereotype.Component;

@Component("offersUS")
public class OffersUS implements Offers {

	@Override
	public String getOffers() {
		return "Thanks Giving day offer!!";
	}

}
