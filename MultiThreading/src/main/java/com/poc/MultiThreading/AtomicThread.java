package com.poc.MultiThreading;

import java.util.concurrent.atomic.AtomicLong;

class AtomicClient{
	public static AtomicLong client = new AtomicLong(0);
}
public class AtomicThread extends Thread{
	
	public void run() {
		
		System.out.println(getName() + ":" + AtomicClient.client.incrementAndGet());
		
		/* Output has no duplicates but not synchronized
		 * Bcz of two reasons: 
		 * > When did thread get access to client(Depends on Scheduling) 
		 * > When did System.out write it    
		 */ 
	}
	
	
	public static void main(String[] args) {
		for(int i=0; i<25; i++){
			Thread t = new AtomicThread();
			t.start();
		}
	}

}
