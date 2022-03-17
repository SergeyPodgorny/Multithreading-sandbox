package com.multithreading.sandbox.executorAPI;

public class RunnabeTasks {
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	};
	
	}

}
