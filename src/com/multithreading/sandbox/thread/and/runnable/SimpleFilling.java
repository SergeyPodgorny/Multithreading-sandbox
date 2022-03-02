package com.multithreading.sandbox.thread.and.runnable;

import java.util.Arrays;

public class SimpleFilling {
	
	
	private int matrixSize = 4;
	
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	
	public void createSimpleArray() {
		createSparseArray();
		fillArray();
//		printer();
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
		for (int i = matrixSize; i < matrixSize*matrixSize-matrixSize; i++) {
			for (int j = matrixSize; j < matrixSize*matrixSize-matrixSize; j++) {
				if (i==j) {
					someArray[i][j] = 8;
				}
			}
			
		}
	}
	
	private void printer () {
		System.out.println(Arrays.deepToString(someArray).replace("], ", "]\n"));
	}
	
}
