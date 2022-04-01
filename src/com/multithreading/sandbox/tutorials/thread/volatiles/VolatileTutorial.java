package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileTutorial {
	
	
	static volatile char target;
	
	static int maxIter = 5;
	
	
	public static void main (String[] args) {
		
		
		
		{
		
		Runnable writer = ()->{
			
			target= '{';
//			System.out.println(target);
			
			
			
			target= '}';
//			System.out.println(target+ " from " + Thread.currentThread().getName());
			
						
		};
		
		
		
		new Thread(writer) {
			
		}.start();
		
		new Thread(writer) {
			
		}.start();
		
		
		
		}
		
		
		
	}
}
