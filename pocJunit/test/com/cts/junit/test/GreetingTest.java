package com.cts.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.junit.main.GreetingImpl;

public class GreetingTest {

	private GreetingImpl name;
	
	@Before//When ever @Test is executed @Before will call 
	public void setup() {
		name = new GreetingImpl();
		System.out.println("In @Before");
	}
	
	@Test
	public void greetingShouldReturnValidOutput() {
		System.out.println("greetingShouldReturnValidOutput");
		String result=name.greeting("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetingShouldException_For_NameIsNull(){
		System.out.println("greetingShouldException_For_NameIsNull");
		name.greeting(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetingShouldException_For_NameIsBlank(){
		System.out.println("greetingShouldException_For_NameIsBlank");
		name.greeting("");
	}
	
	@After//For cleanup
	public void teardown(){
		name = null;
		System.out.println("In @After");
	}

}
