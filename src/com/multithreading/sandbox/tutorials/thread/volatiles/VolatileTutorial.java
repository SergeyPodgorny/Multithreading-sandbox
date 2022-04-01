package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileTutorial {
	
	
	static volatile char target;
	
	static int maxIter = 5;
	
	
	public static void main (String[] args) {
		
		
		
		{
		
		Runnable writer = ()->{
			
			target= '{';
			System.out.println(target);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			target= '}';
			System.out.println(target);
			
						
		};
		
		
		new Thread(writer) {
			
		}.start();
		
		new Thread(writer) {
			
		}.start();
		
		
		}
	}
}
