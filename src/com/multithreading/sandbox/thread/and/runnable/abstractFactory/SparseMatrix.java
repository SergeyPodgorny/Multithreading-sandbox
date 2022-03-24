package com.multithreading.sandbox.thread.and.runnable.abstractFactory;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class SparseMatrix implements RunnableTask {
	
	
	private volatile double [][] someArray = new double[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];

	public SparseMatrix(double[][] someArray) {
		this.someArray = someArray;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < MATRIX_SIZE*MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE*MATRIX_SIZE; j++) {
				if (i==j) {
					someArray[i][j] = 1;
				}
			}
		}
	}

}
