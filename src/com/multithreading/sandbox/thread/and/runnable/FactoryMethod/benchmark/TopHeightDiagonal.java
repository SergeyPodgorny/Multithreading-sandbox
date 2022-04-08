package com.multithreading.sandbox.thread.and.runnable.FactoryMethod.benchmark;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class TopHeightDiagonal implements RunnableTask{

	
	private volatile double [][] someArray = new double[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];

	public TopHeightDiagonal(double[][] someArray) {
		this.someArray = someArray;
	}
	
	@Override
	public void run() {
		for (int i = MATRIX_SIZE+1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE+3; i++) {
			for (int j = MATRIX_SIZE+1; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE+3; j++) {
				if (i + MATRIX_SIZE == j) {
					someArray[i][j] = 5;
					if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
						someArray[i][j] = 0;
					}
				}
			}
			
		}
		
		
		
	}
	
}
