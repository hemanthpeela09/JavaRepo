package com.spring.core.ioc.di;

public class Communication {
	private Messaging postMessage;
	
	public Communication(Messaging postMessage){
		super();
		this.postMessage = postMessage;
	}
	
	public void communicate() {
		postMessage.sendMessage();
	}
}
