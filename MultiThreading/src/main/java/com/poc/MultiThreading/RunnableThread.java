package com.poc.MultiThreading;

/*
 * Instead of Thread we can implement threading using Runnable
 */
public class RunnableThread implements Runnable {

	public void run() {
		System.out.println("Start of thread: " + Thread.currentThread().getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of thread: " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		  
		  System.out.println("Start of Main: ");

		  for (int i=0; i<10; i++){
			  //First way of initialization
			  //Thread t = new Thread(new RunnableThread());
			  //t.start();
			  
			  //Second way of initialization
			  RunnableThread t = new RunnableThread();
			  new Thread(t).start();
			  
		   
		   try {
			   Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }

		  }
		  System.out.println("End of Main: ");
	}
}

