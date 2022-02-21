package com.multithreading.sandbox.thread.and.runnable;

public class FillingWithInnerClass extends Thread{
	
	
	private volatile int[] someArray = new int[500];
	
	
	public void createArray() throws InterruptedException {
		
		SparseMatrix thread1 = new SparseMatrix();
		thread1.start();
		
		
		FillMatrix thread2 = new FillMatrix();
		thread2.start();
		
		
	}
	

	private class SparseMatrix extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				someArray[i] = 0;
			}
		}
		
		
	}
	
	private class FillMatrix extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				
				if (i % 5 == 0) {
					someArray[i] = 5;
				}
			}
		}
		
		
	}
	
	
	public void printer() {
		for (int i = 0; i < 500; i++) {
			System.out.println(someArray[i]);
		}
	}
	
	
}
