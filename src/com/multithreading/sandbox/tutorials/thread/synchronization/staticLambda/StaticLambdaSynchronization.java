package com.multithreading.sandbox.tutorials.thread.synchronization.staticLambda;

public class StaticLambdaSynchronization {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			synchronized (StaticLambdaSynchronization.class) {
				System.out.println("{");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("}");
			}
			
			
		};
		
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(r1);
		
		
		t1.start();
		
		t2.start();
		
		
		
	}

}
