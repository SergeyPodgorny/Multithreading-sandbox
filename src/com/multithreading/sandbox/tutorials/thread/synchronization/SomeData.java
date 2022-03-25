package com.multithreading.sandbox.tutorials.thread.synchronization;

public class SomeData {

	
	
	
	public synchronized void runner() {
		System.out.println(Thread.currentThread().getName()+" prints a");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" prints b");
		
	}
	
	
	
	
	
	
}
