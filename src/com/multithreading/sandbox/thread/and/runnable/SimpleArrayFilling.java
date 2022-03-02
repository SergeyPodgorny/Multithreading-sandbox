package com.multithreading.sandbox.thread.and.runnable;

public class SimpleArrayFilling {
	
	
	private int matrixSize = 49;
	
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	
	public void createSimpleArray() {
		createSparseArray();
		fillArray();
	}
	
	private void createSparseArray() {
		for (int i = 1; i < matrixSize*matrixSize; i++) {
			for (int j = 1; j < matrixSize*matrixSize; j++) {
				if (i==j) {
					someArray[i][j] = 1;
				}
			}
		}
	}

	private void fillArray() {
		for (int i = matrixSize + 1; i < matrixSize*matrixSize-matrixSize; i++) {
			for (int j = matrixSize + 1; j < matrixSize*matrixSize-matrixSize; j++) {
				someArray[i][j] = 8;
			}
			
		}
	}
	
	
}
