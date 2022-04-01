package com.multithreading.sandbox.tutorials.thread.volatiles;

public class Singleton {
	
	private static Singleton INSTANCE;

	private Singleton() {
		System.out.println("Singleton created");
	}
	
	
	
	public static Singleton getInstance() {
		
		if (INSTANCE == null) {
			return new Singleton();
		} else {
			throw new RuntimeException();
		}
		
	}
	
	
	
	

}
