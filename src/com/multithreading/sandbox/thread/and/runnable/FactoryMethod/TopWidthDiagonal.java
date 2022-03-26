package com.multithreading.sandbox.thread.and.runnable.FactoryMethod;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class TopWidthDiagonal implements RunnableTask{

	
	private volatile double [][] someArray = new double[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];

	public TopWidthDiagonal(double[][] someArray) {
		this.someArray = someArray;
	}
	
	@Override
	public void run() {
		for (int i = MATRIX_SIZE+1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE; i++) {
			for (int j = MATRIX_SIZE+1; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE; j++) {
				if (i + 1 == j) {
					someArray[i][j] = 3;
					if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
							someArray[i][j] = 0;
						}
					}
				}
				
			}
	}
	
}
