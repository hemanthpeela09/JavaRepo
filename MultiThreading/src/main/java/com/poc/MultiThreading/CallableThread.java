package com.poc.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WorkerThreadCallable implements Callable<Long>{
	long sleepTime;
	
	public WorkerThreadCallable(long sleepTime){
		this.sleepTime = sleepTime;
	}
	
	public Long call() throws Exception {
		System.out.println("In Worker Thread");
		Thread.sleep(sleepTime);
		return sleepTime * 10;
	}
}

public class CallableThread {

	//Example for : Pass value to thread & it returns value from thread 
	public static void main(String[] args) throws Exception {
		System.out.println("Started Main");
		
		Callable<Long> worker = new WorkerThreadCallable(1000);
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Long> future = executorService.submit(worker);
		
		System.out.println("Returned value "+ future.get());
		executorService.shutdown();
		
		System.out.println("End of Main");
		
	}

}
