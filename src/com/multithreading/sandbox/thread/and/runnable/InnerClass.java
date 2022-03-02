package com.multithreading.sandbox.thread.and.runnable;

import java.util.Arrays;

public class InnerClass{
	
	
	private int matrixSize = 4;
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	
	public void createArray() {
		
		SparseMatrix thread1 = new SparseMatrix();
		thread1.start();
		
		
		PrimaryDiagonal thread2 = new PrimaryDiagonal() ;
		thread2.start();
		
		TopWidthDiagonal thread3 = new TopWidthDiagonal();
		thread3.start();
		
		
	}
	
	
	
	
	
	
	private class SparseMatrix extends Thread {
		
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
		
		
	}
	
	private class PrimaryDiagonal extends Thread{
		
		@Override
		public void run() {
			for (int i = matrixSize+1; i < matrixSize*matrixSize-matrixSize-1; i++) {
				for (int j = matrixSize+1; j <matrixSize*matrixSize-matrixSize-1; j++) {
					if (i==j) {
						someArray[i][j] = 8;
						if ((i % matrixSize-1 == 0)^(i % matrixSize-1 == 1)) {
							someArray[i][j] = 1;
						}
					}
					
					
					
				}
				
			}
			
		}
		
		
	}
	
	
	private class TopWidthDiagonal extends Thread{
		
		@Override
		public void run() {
			for (int i = matrixSize; i < matrixSize*matrixSize-matrixSize; i++) {
				for (int j = matrixSize; j < matrixSize*matrixSize-matrixSize; j++) {
					if (i + 1 == j) {
						someArray[i][j] = 3;
					}
				}
				
			}
		}
		
		
	}
	
	
	
	public void printer () {
		System.out.println(Arrays.deepToString(someArray).replace("], ", "]\n"));
	}
	
	
	
	
}
