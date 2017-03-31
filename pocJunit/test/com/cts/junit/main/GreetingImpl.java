package com.cts.junit.main;


public class GreetingImpl implements Greeting {

	public String greeting(String name) {
		
		if(name == null || name.length() == 0 )
		{
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

}
