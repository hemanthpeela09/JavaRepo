package com.udemy.spring.ioc;

import com.udemy.spring.di.Conditions;
import com.udemy.spring.di.Offers;

public interface Insurance {
	public String showStatus();
	public Offers getCurrentOffer();
	public Conditions getCond();
}
