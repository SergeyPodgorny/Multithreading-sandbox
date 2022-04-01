package com.multithreading.sandbox.tutorials.thread.volatiles;

public class Singleton {
	
	private volatile static Singleton INSTANCE;

	private Singleton() {
		System.out.println("Singleton created");
	}
	
	
	
	public static Singleton getInstance() {
		
		if (INSTANCE == null) {
			new Singleton();
			} else {
			throw new RuntimeException();
		}
		
		return INSTANCE;
	}
	
	
	
	

}
