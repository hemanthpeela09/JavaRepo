package com.poc.MultiThreading;

public class ThreadGroupTest implements Runnable{
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadGroupTest runnable = new ThreadGroupTest();
		ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(tg, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg, runnable, "three");
		t3.start();
		
		System.out.println("Thread Group Name: "+ tg.getName());
		tg.list();
		
		//All thread in this group will be interrupted
		Thread.currentThread().getThreadGroup().interrupt();
		
	}

}
