package com.multithreading.sandbox.thread.and.runnable;

import java.util.Arrays;

public class InnerClass{
	
	
	private int matrixSize = 15;
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	
	public void createArray() {
		
		SparseMatrix thread1 = new SparseMatrix();
		thread1.start();
		
		
		PrimaryDiagonal thread2 = new PrimaryDiagonal() ;
		thread2.start();
		
		

		
		
	}
	
	
	
	
	
	
	private class SparseMatrix extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < matrixSize*matrixSize; i++) {
				for (int j = 0; j < matrixSize*matrixSize; j++) {
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
			for (int i = matrixSize; i < matrixSize*matrixSize-matrixSize; i++) {
				for (int j = matrixSize; j < matrixSize*matrixSize-matrixSize; j++) {
					if (i==j) {
						someArray[i][j] = 8;
					}
				}
				
			}
			
		}
		
		
	}
	
	
	public void printer () {
		System.out.println(Arrays.deepToString(someArray).replace("], ", "]\n"));
	}
	
	
	
	
}
