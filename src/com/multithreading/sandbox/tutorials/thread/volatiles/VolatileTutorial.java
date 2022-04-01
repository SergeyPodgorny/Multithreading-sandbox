package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileTutorial {
	
	
	static char target;
	
	static int maxIter = 5;
	
	
	public static void main (String[] args) {
		
		
		
		{
		
		Runnable writer1 = ()->{
			
			target= '{';
			System.out.println(target);
			
			
			
		};
		
		Runnable writer2 = ()->{
			
			target = '}';
			System.out.println(target);
			
			
		};
		
		
//		Runnable printer = () -> {
//			
//			System.out.println(target);
//			
//		};
		
		
		
		
		
		new Thread(writer1) {
			
		}.start();
		
		new Thread(writer2) {
			
		}.start();
		
		
//		new Thread (printer) {
//			
//		}.start();
		
		
		}
	}
}
