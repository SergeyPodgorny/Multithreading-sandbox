package com.multithreading.sandbox.tutorials.thread.synchronization;





public class ThreadLauncher {
	
	
	public static void main(String[] args) {
		
		
		// синхронизация не статичного метода
		
//		NonStaticMethodSync nonStaticMethod = new NonStaticMethodSync();
//		
//		Thread t1 = new Thread(nonStaticMethod);
//		
//		Thread t2 = new Thread(nonStaticMethod);
//		
//		t1.start();
//				
//		t2.start();
		
		
		// синхронизация статичного метода
	
		StaticMethodSync staticMethod = new StaticMethodSync();
		
		
		Thread t1 = new Thread(staticMethod);
		
		Thread t2 = new Thread(staticMethod);
		
		t1.start();
		
		t2.start();
		
		
	}
	

}
