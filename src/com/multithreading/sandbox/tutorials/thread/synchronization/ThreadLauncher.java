package com.multithreading.sandbox.tutorials.thread.synchronization;





public class ThreadLauncher {
	
	
	public static void main(String[] args) {
		
		
		NonStaticMethodSync method1 = new NonStaticMethodSync();
		
		Thread t1 = new Thread(method1);
		
		Thread t2 = new Thread(method1);
		
		t1.start();
				
		t2.start();
		
	}
	

}
