package com.multithreading.sandbox.tutorials.thread.volatiletutorial;

public class Singleton {
	
	private volatile static Singleton INSTANCE;

	private Singleton() {
		System.out.println("Singleton created");
	}
	
	
	
	public static Singleton getInstance() {
		
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new Singleton();
				} else {
					throw new RuntimeException();
				}
			}
			 			
			} 
		
		return INSTANCE;
	}
	
	
	
	

}
