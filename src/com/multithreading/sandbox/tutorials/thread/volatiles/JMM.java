package com.multithreading.sandbox.tutorials.thread.volatiles;

public class JMM {

	
	public static volatile int x;
	public static volatile int y;
	public static volatile int r1;
	public static volatile int r2;
	
	
	public static void main(String[] args) {
				
		Runnable t1 = () -> {
			
			x = 1;
			y = 2;
			
			
		};
		
		Runnable t2 = () ->{
			
			r1 = y;
			r2 = x;
			
		};

			new Thread(t1).start();
			
			new Thread(t2).start();
		
		
		
		
		
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
	}

}



	
