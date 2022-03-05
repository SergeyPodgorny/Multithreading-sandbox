package com.multithreading.sandbox.thread.and.runnable;

import java.util.Arrays;

public class SimpleFilling {
	
	
	private int matrixSize = 4;
	
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];
	
	
	public void createSimpleArray() {
		createSparseArray();
		fillArray();
		printer();
	}
	
	
	
	
	private void createSparseArray() {
		for (int i = 0; i < matrixSize*matrixSize; i++) {
			for (int j = 0; j < matrixSize*matrixSize; j++) {
				if (i==j) {
					someArray[i][j] = 1;
				}
			}
		}
	}

	
	// primaryDiagonal
	private void fillArray() {
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
		
	
		
		
		//TopWidthDiagonal
		
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
		
		
		//BotWidthDiagonal
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
		
		//ToHeightDiagonal
		for (int i = matrixSize+1; i < matrixSize*matrixSize-matrixSize+3; i++) {
			for (int j = matrixSize+1; j < matrixSize*matrixSize-matrixSize+3; j++) {
				if (i + matrixSize == j) {
					someArray[i][j] = 5;
					if ((i % matrixSize == 3)^(i % matrixSize == 0)) {
						someArray[i][j] = 0;
					}
				}
			}
			
		}
		
		
		//BottomHeightDiagonal
		
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
	
	private void printer () {
		System.out.println(Arrays.deepToString(someArray).replace("], ", "]\n"));
	}
	
}
