package com.poc.MultiThreading;

public class JoinTest extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++){
			try{
				sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i +" Thread name: "+getName());
		}
	}
	
	public static void main(String[] args) {
		JoinTest t1 = new JoinTest();
		JoinTest t2 = new JoinTest();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
