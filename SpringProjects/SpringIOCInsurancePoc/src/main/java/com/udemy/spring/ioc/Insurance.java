package com.udemy.spring.ioc;

import com.udemy.spring.di.Offers;

public interface Insurance {
	public String showStatus();
	public int getValidity();
	public Offers getCurrentOffer();
}
