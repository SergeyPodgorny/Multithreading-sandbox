package com.multithreading.sandbox.tutorials.thread.synchronization;

public class ThreadSynchronization {

	
	/**
	 * Здесь решается проблема синхронизации разных потоков, обращающихся к одному ресурсу
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		
		
		
		NonSyncData data1 = new NonSyncData(5);
		
		
		Runnable writer = () -> {
			
			for(int i = 0; i<5; i++) {
				data1.setData(i);
				System.out.println(Thread.currentThread().getName()+data1.getData());
			}
			
		};
		
		Runnable reader = () -> {
			
			
			for(int i = 0; i <5; i++) {
				System.out.println(Thread.currentThread().getName()+data1.getData());
			}
			
		};
		
		
		Thread writerThread = new Thread(writer);
		
		Thread readerThread = new Thread(reader);
		
		writerThread.start();
		
		readerThread.start();
		
	}
	
	
	
}
