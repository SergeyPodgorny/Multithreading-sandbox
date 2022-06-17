package com.multithreading.sandbox.tutorials.thread.synchronization;

public class StaticMethodSync implements Runnable{
	
	
	public void run() {
		nonStaticMethod();
	}
	
	
	private synchronized static void nonStaticMethod() {
		
		System.out.println("{");
		
		try {
			Thread.sleep(100);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("}");
	}
	
	

}
