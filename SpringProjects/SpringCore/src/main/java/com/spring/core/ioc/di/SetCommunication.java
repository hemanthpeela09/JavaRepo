package com.spring.core.ioc.di;

public class SetCommunication {
	private Messaging postMessage;
	
	public Messaging getPostMessage() {
		return postMessage;
	}

	public void setPostMessage(Messaging postMessage) {
		this.postMessage = postMessage;
	}

	public void communicate() {
		postMessage.sendMessage();
	}
}
