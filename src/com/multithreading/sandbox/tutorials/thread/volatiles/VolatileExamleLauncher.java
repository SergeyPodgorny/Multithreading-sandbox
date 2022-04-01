package com.multithreading.sandbox.tutorials.thread.volatiles;

public class VolatileExamleLauncher {
	
	
	static  int i;
	
	
	
	public static void main (String[] args) {
		
		
		Runnable r1 = () -> {
			
			Singleton.getInstance();
		
		};
		
		
		new Thread(r1) {
			
		}.start();
		
		new Thread(r1) {
			
		}.start();
		
	}
	
	
	
	
	
}
