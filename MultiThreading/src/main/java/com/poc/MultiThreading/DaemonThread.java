package com.poc.MultiThreading;

public class DaemonThread extends Thread{
	public void run(){
		if(isDaemon()){
			System.out.println(getName() + " Daemon Thread");
		} else {
			System.out.println(getName() + " Normal Thread");
		}
	}

	public static void main(String[] args) {
		DaemonThread t = new DaemonThread();
		DaemonThread t1 = new DaemonThread();
		
		t.setDaemon(true);
		t.start();
		
		//After thread is started u cannot make thread as Daemon Exception occurs
		//t.setDaemon(true);
		
		t1.start();
	}

}
