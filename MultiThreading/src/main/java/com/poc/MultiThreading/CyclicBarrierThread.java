package com.poc.MultiThreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Aggregator extends Thread{
	public void run(){
		System.out.println("In Aggregator");
	}
}

class WorkerThread extends Thread{
	CyclicBarrier syncPoint;
	
	public WorkerThread(CyclicBarrier cyclicBarrier, String name){
		this.setName(name);
		this.syncPoint = cyclicBarrier;
		this.start();
	}
	
	public void run(){
		System.out.println("Entered "+ getName());
		
		try {
			syncPoint.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	
}

public class CyclicBarrierThread {
	
	public static void main(String[] args) {
		System.out.println("Entered into Main");
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new Aggregator()); //Run 4 threads n call Aggregator
		
		new WorkerThread(cyclicBarrier, "2017");
		snooze();
		new WorkerThread(cyclicBarrier, "2010");
		snooze();
		new WorkerThread(cyclicBarrier, "2013");
		snooze();
		new WorkerThread(cyclicBarrier, "2012");
		snooze();
		new WorkerThread(cyclicBarrier, "2011");
		snooze();
		new WorkerThread(cyclicBarrier, "2016");
		System.out.println("End of Main");
	}
	
	private static void snooze(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
