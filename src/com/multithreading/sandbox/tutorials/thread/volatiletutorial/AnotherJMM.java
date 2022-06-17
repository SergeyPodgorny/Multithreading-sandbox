package com.multithreading.sandbox.tutorials.thread.volatiletutorial;



public class AnotherJMM {
	
	static volatile int x;
	static volatile boolean isReady;
	
	
	
	public static void main(String[] args) {
		
		new Thread2().start();
		
		new Thread1().start();
		
		
		
		
	}
	
	private static class Thread1 extends Thread{
		
		@Override
		public void run() {
			x = 1;
			isReady = true;
		}
		
		
		
	}
	
	private static class Thread2 extends Thread{
		
		@Override
		public void run() {
			if (isReady) {
				System.out.println(x);
			}
		}
		
	}
	
	

}
