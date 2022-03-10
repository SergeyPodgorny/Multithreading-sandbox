package com.multithreading.sandbox.thread.and.runnable;

public class AnonymousClass extends Thread{
	
	
	private int matrixSize = 49;
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	{
	
	new Thread() {
		
		
		// creating sparse array
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
		
		
		
		// primary diagonal
		@Override
		public void run() {
			for (int i = matrixSize+1; i < matrixSize*matrixSize-matrixSize-1; i++) {
				for (int j = matrixSize+1; j <matrixSize*matrixSize-matrixSize-1; j++) {
					if (i==j) {
						someArray[i][j] = 8;
						if ((i % matrixSize == 3)^(i % matrixSize == 0)) {
							someArray[i][j] = 1;
						}
						
					}
							
				}
				
			}
	}
		
	}.start();
	
	
	new Thread() {
				
		// TopWidthDiagonal
		@Override
		public void run() {
			for (int i = matrixSize+1; i < matrixSize*matrixSize-matrixSize; i++) {
				for (int j = matrixSize+1; j < matrixSize*matrixSize-matrixSize; j++) {
					if (i + 1 == j) {
						someArray[i][j] = 3;
						if ((i % matrixSize == 3)^(i % matrixSize == 0)) {
							someArray[i][j] = 0;
						}
					}
				}
				
			}
	}
		
	}.start();
	
	
	//BotttomWidthDiagonal
	
	new Thread() {
		
		
		@Override
		public void run() {
			for (int i = matrixSize; i < matrixSize*matrixSize-matrixSize-1; i++) {
				for (int j = matrixSize; j < matrixSize*matrixSize-matrixSize-1; j++) {
					if (j + 1 == i) {
						someArray[i][j] = 3;
						if ((i % matrixSize == 3)^(i % matrixSize == 0)) {
							someArray[i][j] = 0;
						}
					}
				}
				
			}
	}
		
	}.start();
	
	
	//TopHeightDiagonal
	
new Thread() {
		
		
		@Override
		public void run() {
			for (int i = matrixSize; i < matrixSize*matrixSize-matrixSize-1; i++) {
				for (int j = matrixSize; j < matrixSize*matrixSize-matrixSize-1; j++) {
					if (j + 1 == i) {
						someArray[i][j] = 3;
						if ((i % matrixSize == 3)^(i % matrixSize == 0)) {
							someArray[i][j] = 0;
						}
					}
				}
				
			}
	}
		
	}.start();
	
	
	
	
	//BottomHeightDiagonal
	new Thread() {
		
		@Override
		public void run() {
			for (int i = 1; i < matrixSize*matrixSize-matrixSize-1; i++) {
				for (int j = 1; j < matrixSize*matrixSize-matrixSize-1; j++) {
					if (j + matrixSize == i) {
						someArray[i][j] = 5;
						if ((i % matrixSize == 3)^(i % matrixSize == 0)) {
							someArray[i][j] = 0;
						}
					}
				}
				
			}
			
			
			
		}

	}.start();
	
	
	
	
	}
	
	
	
	
	
	
}