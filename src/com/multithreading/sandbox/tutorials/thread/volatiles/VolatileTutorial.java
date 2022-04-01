package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileTutorial {
	
	
	static volatile int target;
	
	static int maxIter = 5;
	
	
	public static void main (String[] args) {
		
		
		
		{
		
		Runnable writer = ()->{
			
			while(maxIter < 5) {
				target++;
			}
			
			
		};
		
		Runnable printer = () -> {
			
			while (target > 1) {
			
				System.out.println(target);
				
			}
			
		};
		
		
		new Thread(writer) {
			
		}.start();
		
		
		new Thread (printer) {
			
		}.start();
		
		
		}
	}
}
