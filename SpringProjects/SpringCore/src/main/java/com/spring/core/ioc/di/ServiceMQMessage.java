package com.spring.core.ioc.di;

public class ServiceMQMessage implements Messaging {
	public void sendMessage() {
		System.out.println("Sending Message API ServiceMQMessage called!!");
	}
}
