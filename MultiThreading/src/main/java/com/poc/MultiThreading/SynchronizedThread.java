package com.poc.MultiThreading;

class Client{
	public static long client = 0;
}
public class SynchronizedThread extends Thread{
	
	public void run() {
		//synchronized block not recommended - Instead of this Util Atomic classes preferred
		synchronized (Client.class) {
			/*Here if we use synchronized() these 2 statements will be locked (Client class)
			* other class threads need to wait until this executes
			* in between no one can change the variable
			*/ 
			Client.client++;
			System.out.print(Client.client + " ");
		}
		
		//Duplicate thread will call 
		//Client.client++;
		//System.out.print(Client.client + " ");
	}
	
	
	public static void main(String[] args) {
		for(int i=0; i<25; i++){
			Thread t = new SynchronizedThread();
			t.start();
		}
	}

}
