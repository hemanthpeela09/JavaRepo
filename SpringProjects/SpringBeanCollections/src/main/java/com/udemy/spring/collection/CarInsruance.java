package com.udemy.spring.collection;

import java.util.Map;

public class CarInsruance implements Insurance {
	private Map<String,String> members;

	@Override
	public String showStatus() {
		return "You have Car Insurance";
	}

	public Map<String,String> getMembers() {
		return members;
	}

	public void setMembers(Map<String,String> members) {
		this.members = members;
	}

}
