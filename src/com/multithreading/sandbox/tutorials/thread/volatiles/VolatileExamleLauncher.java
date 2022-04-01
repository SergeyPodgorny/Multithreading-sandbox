package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileExamleLauncher {
	
	
	
	
	
	
	public static void main (String[] args) throws InterruptedException {
		
		
		Runnable r1 = () -> {
			
			Singleton.getInstance();
			
		};
		
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		
		t2.start();
		
		
		
//		Singleton.getInstance();
//		Singleton.getInstance();
	}
	
	
	
	
	
}
