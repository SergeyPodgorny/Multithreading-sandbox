package com.multithreading.sandbox.tutorials.synchronization;

public class NonStaticMethodSync implements Runnable{
	
	
	
	
	public void run() {
		nonStaticMethod();
	}
	
	
	/**
	 * Здесь нужно добавить synchronized
	 */
	
	private synchronized void nonStaticMethod() {
		System.out.println("{");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("}");
		
	}
	

}
