package com.poc.MultiThreading;

public class SleepTest extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			try{
				sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepTest t1 = new SleepTest();
		SleepTest t2 = new SleepTest();
		System.out.println("t1 started");
		t1.start();
		System.out.println("t1 done");
		System.out.println("t2 Started");
		t2.start();
		System.out.println("t2 done");
		System.out.println("Priority of t1:" + t1.getPriority());
		System.out.println("Priority of t2:" + t2.getPriority());
	}

}
