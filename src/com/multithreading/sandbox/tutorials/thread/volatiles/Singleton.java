package com.multithreading.sandbox.tutorials.thread.volatiles;

public class Singleton {
	
	private volatile static Singleton INSTANCE = null;

	private Singleton() {
		System.out.println("Singleton created");
	}
	
	
	
	public static Singleton getInstance() {
		
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
			return INSTANCE;
		} else {
			throw new RuntimeException();
		}
		
	}
	
	
	
	

}
