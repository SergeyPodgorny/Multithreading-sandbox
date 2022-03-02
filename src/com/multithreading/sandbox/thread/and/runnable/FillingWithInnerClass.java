package com.multithreading.sandbox.thread.and.runnable;

public class FillingWithInnerClass extends Thread{
	
	
	private int matrixSize = 49;
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	
	public void createArray() {
		
		SparseMatrix thread1 = new SparseMatrix();
		thread1.start();
		
		
		PrimaryDiagonal thread2 = new PrimaryDiagonal() ;
		thread2.start();
		
		
//		FillMatrix thread2 = new FillMatrix();
//		thread2.start();
		
		
	}
	
	
	
	
	
	
	private class SparseMatrix extends Thread {
		
		@Override
		public void run() {
			for (int i = 1; i < matrixSize*matrixSize; i++) {
				for (int j = 1; j < matrixSize*matrixSize; j++) {
					if (i==j) {
						someArray[i][j] = 1;
					}
				}
			}
		}
		
		
	}
	
	private class PrimaryDiagonal extends Thread{
		
		@Override
		public void run() {
			for (int i = matrixSize + 1; i < matrixSize*matrixSize-matrixSize; i++) {
				for (int j = matrixSize + 1; j < matrixSize*matrixSize-matrixSize; j++) {
					someArray[i][j] = 8;
				}
				
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
}
