package com.multithreading.sandbox.tutorials.thread.synchronization;

public class ThreadSynchronization {

	
	/**
	 * Здесь решается проблема синхронизации разных потоков, обращающихся к одному ресурсу
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		SomeData someData = new SomeData();
		
		
		
		Runnable writer = () -> {
			
			for(int i = 0; i<5; i++) {
				someData.changeData();
				System.out.println(Thread.currentThread().getName()+ " " +"value"+someData.getData());
			}
			
		};
		
		Runnable writer1 = () -> {
			
			for(int i = 0; i<5; i++) {
				someData.changeData();
				System.out.println(Thread.currentThread().getName()+ " " +"value"+someData.getData());
			}
			
		};
		
		System.out.println("Non synchronized data writing/reading");
		Thread writerThread = new Thread(writer);
		Thread writerThread1 = new Thread(writer1);
		
		
		writerThread.start();
		writerThread1.start();
		writerThread.join();
		writerThread1.join();

		
		
		

		
		
	}
	
	
	
}
