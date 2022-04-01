package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileTutorial {
	
	
	static volatile int i;
	
	
	
	public static void main (String[] args) {
		
		
		Runnable writer = () -> {
			
			while(i < 5) {
				
				System.out.println("Incremented to " + ++i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		};
		
		
		
		Runnable reader = ()-> {
			
			int localI = i;
				
				while (localI<5) {
					if (localI!=1) {
						System.out.println("value of i is "+ i);
						localI = i;
					}
					
					
				}
			
		};
		
		new Thread(writer) {
		}.start();
		
		
		
		new Thread(reader) {
		}.start();
		
	}
	
	
	
	
	
}
