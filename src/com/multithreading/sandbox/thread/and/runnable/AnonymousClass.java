package com.multithreading.sandbox.thread.and.runnable;

public class AnonymousClass extends Thread{
	
	
	private int matrixSize = 49;
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	{
	
	new Thread() {
		
		@Override
		public void run() {
			for (int i = 0; i < matrixSize*matrixSize; i++) {
				for (int j = 0; j < matrixSize*matrixSize; j++) {
					if (i==j) {
						someArray[i][j] = 2;
					}
				}
			}
	}
		
	}.start();
	
	new Thread() {
		
		@Override
		public void run() {
			for (int i = 0; i < matrixSize*matrixSize; i++) {
				for (int j = 0; j < matrixSize*matrixSize; j++) {
					if (i==j) {
						someArray[i][j] = 2;
					}
				}
			}
	}
		
	}.start();
	
	
	
	}
	
	
	
	
	
	
}