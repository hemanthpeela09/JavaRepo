package com.spring.core.ioc.di;

public class ActiveMQMessage implements Messaging {

	public void sendMessage() {
		System.out.println("Sending Message API ActiveMQMessage called!!");
	}
}
