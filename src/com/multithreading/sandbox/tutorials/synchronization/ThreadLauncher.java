package com.multithreading.sandbox.tutorials.synchronization;





public class ThreadLauncher {
	
	
	public static void main(String[] args) {
		
		
		// синхронизация нестатичного метода
		
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
	
//		StaticMethodSync staticMethod = new StaticMethodSync();
//		
//		
//		Thread t1 = new Thread(staticMethod);
//		
//		Thread t2 = new Thread(staticMethod);
//		
//		t1.start();
//		
//		t2.start();
		
		
		// синхронизация нестатичного метода, который содердит блок кода
		
//			NonStaticMethodWithBlock nonStaticMethodWithBlock = new NonStaticMethodWithBlock(); 
//			
//			
//			Thread t1 = new Thread(nonStaticMethodWithBlock);
//			
//			Thread t2 = new Thread(nonStaticMethodWithBlock);
//			
//			t1.start();
//			
//			t2.start();
		
		
		StaticMethodWithBlock staticMethodWithBlock = new StaticMethodWithBlock();
		
		Thread t1 = new Thread(staticMethodWithBlock);
		
		Thread t2 = new Thread(staticMethodWithBlock);
		
		t1.start();
		
		t2.start();
		
		
		
		
	}
	

}
