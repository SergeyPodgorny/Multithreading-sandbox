package com.multithreading.sandbox.tutorials.thread.synchronization;

public class ThreadSynchronization {

	
	/**
	 * Здесь решается проблема синхронизации разных потоков, обращающихся к одному ресурсу
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		SomeData someTask = new SomeData();
		
		
		ThreadLauncher thread = new ThreadLauncher(someTask);
		
		ThreadLauncher thread1 = new ThreadLauncher(someTask);
		
		thread.start();
//		thread1.join();
		thread1.start();
		
		
		
			
		
	}
	
	
	
}
