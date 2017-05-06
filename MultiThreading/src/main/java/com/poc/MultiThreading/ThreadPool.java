package com.poc.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread1 implements Runnable{
private String message;
	
	public WorkerThread1(String s){
		this.message = s;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Start message = "+ message);
		processmessage();
		System.out.println(Thread.currentThread().getName() + " End message ");
	}
	
	public void processmessage(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i = 0; i < 10 ; i++){
			Runnable worker = new WorkerThread1("" + i);
			service.execute(worker);
		}
		service.shutdown();
		while(!service.isTerminated()){
		}
		
		System.out.println("All Threads Executed ");
	}

}
