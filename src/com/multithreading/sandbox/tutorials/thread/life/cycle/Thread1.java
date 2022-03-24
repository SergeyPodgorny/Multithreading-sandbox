package com.multithreading.sandbox.tutorials.thread.life.cycle;

public class Thread1 extends Thread {
	
	
	/**
	 * Здесь изучаются манипуляции с жизненным циклом разных потоков
	 * 
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	
	public static void main(String[] args) {
		
		
		
		
		
		Runnable r1 = () -> {
			System.out.println("Not a main Thread");
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		Thread.yield();
		System.out.println("Thread main");
		
	
	}
	
	
	

	
}





