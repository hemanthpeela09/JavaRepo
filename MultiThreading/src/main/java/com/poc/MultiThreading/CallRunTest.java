package com.poc.MultiThreading;

public class CallRunTest extends Thread{

	public void run(){
		System.out.println("In running......:" + currentThread().getName());
		for(int i=1;i<5;i++){  
		    try{
		    	sleep(200);
		    } catch(InterruptedException e) {
		    	System.out.println(e);
		    }  
		    System.out.println(i);  
		  }  
	}
	
	public static void main(String[] args) {
		CallRunTest t = new CallRunTest();
		CallRunTest t1 = new CallRunTest();
		t.run();
		//t.run();//fine, but does not start a separate call stack
		t1.run();
		
		//If stack is not called, it will be treated as an Object not as an thread;
		t.start();
		t1.start();
		
	}

}
