package com.multithreading.sandbox.tutorials.thread_life_cycle;

public class ThreadLifeCycle extends Thread {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		Runnable r1 = () -> {
			System.out.println("Thread1");
		};
		
		Runnable r2 = () -> {
			System.out.println("Thread2");
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t1.join();
		t2.start();
		
		
		
		
		Thread.sleep(50);
		System.out.println("Thread main");
		
	
	}
	
	
	

	
}





