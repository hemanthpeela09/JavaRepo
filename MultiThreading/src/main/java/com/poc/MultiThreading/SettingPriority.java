package com.poc.MultiThreading;

public class SettingPriority extends Thread{
	
	public void run(){
		System.out.println("In run... Thread Name... "+  currentThread().getName());
		System.out.println("In run... Thread Priority... "+  currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		SettingPriority t = new SettingPriority();
		SettingPriority t1 = new SettingPriority();
		SettingPriority t2 = new SettingPriority();
		
		t1.setPriority(MIN_PRIORITY);
		t.setPriority(NORM_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t.start();
		t2.start();

	}

}
