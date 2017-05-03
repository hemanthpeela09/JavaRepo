package com.poc.MultiThreading;

public class BasicThread extends Thread {

	public void run() {
		System.out.println("Start of thread: " + getName());

		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of thread: " + getName());

	}

	public static void main(String[] args) {
		  
		  System.out.println("Start of Main: ");

		  for (int i=0; i<10; i++){
		   Thread t = new BasicThread();
		   t.start();
		   
		   try {
		    sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }

		  }
		  System.out.println("End of Main: ");
	}
}

