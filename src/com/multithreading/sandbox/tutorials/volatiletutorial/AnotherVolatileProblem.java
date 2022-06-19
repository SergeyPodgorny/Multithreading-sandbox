package com.multithreading.sandbox.tutorials.volatiletutorial;

public class AnotherVolatileProblem {
	
	
	private int localCounter;
	
	
	public AnotherVolatileProblem(int localCounter) {
		this.localCounter = localCounter;
	}

	public void count() {
		
		while(localCounter< 20) {
			System.out.println(localCounter+ " from "+ Thread.currentThread().getName());
			localCounter++;
		}
		
		
		
	}
	

}
