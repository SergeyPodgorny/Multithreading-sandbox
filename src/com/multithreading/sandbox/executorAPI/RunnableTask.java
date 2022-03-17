package com.multithreading.sandbox.executorAPI;

public class RunnableTask {
	
	
	
	private int matrixSize = 49;
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	
	
	
	{
	
	Runnable mainTask = () -> {
		
		
		// creating sparse array
		for (int i = 0; i < matrixSize*matrixSize; i++) {
			for (int j = 0; j < matrixSize*matrixSize; j++) {
				if (i==j) {
					someArray[i][j] = 1;
				}
			}
		}
	
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
	
	
	
	
	
	
	
	
	
	};
	
	}

}
