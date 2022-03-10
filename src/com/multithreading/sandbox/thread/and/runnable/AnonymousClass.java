package com.multithreading.sandbox.thread.and.runnable;

public class AnonymousClass  extends Thread{
	
	{
	
	new Thread() {
		
		@Override
		public void run() {
			System.out.println(123);
	}
		
	}.start();
	
	}
	
}