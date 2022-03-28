package com.multithreading.sandbox.tutorials.thread.synchronization;

public class StaticMethodWithBlock implements Runnable{
	
	
	public void run() {
		staticBlock();
	}
	
	
	
	private static void staticBlock() {
		
		// при синхронизации блока кода в статичном методе на монитор метода не получится сослаться, необходимо ссылаться на монитор класса с помощью метода class 
		
		synchronized (StaticMethodWithBlock.class) {
			System.out.println("{");
			
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("}");
		}
		
	}
	

}
