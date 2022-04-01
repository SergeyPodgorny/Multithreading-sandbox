package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileExamleLauncher {
	
	
	static volatile int localCounter;
	
	
	
	public static void main (String[] args) throws InterruptedException {
		
		
		
		
		
		// Thread safe singleton launch
//		Runnable r1 = () -> {
//			
//			Singleton.getInstance();
//			
//		};
//		
//		
//		
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r1);
//		
//		t1.start();
//		
//		t2.start();
		
		
		
//		Singleton.getInstance();
//		Singleton.getInstance();
	
	
		AnotherVolatileProblem problem = new AnotherVolatileProblem(localCounter);
	
		Runnable r1 = ()->{
			problem.count();
		};
		
		
		
		new Thread(r1).start();
	
		new Thread(r1).start();
		
		new Thread(r1).start();
		
		new Thread(r1).start();
	
	}
	
	
	
	
	
}
