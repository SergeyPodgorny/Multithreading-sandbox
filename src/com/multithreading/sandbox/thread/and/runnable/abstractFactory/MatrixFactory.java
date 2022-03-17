package com.multithreading.sandbox.thread.and.runnable.abstractFactory;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class MatrixFactory {

	
	private volatile double [][] someArray = new double[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];
	
		public RunnableTask createThread(String threadName) {
			
			if(threadName.equalsIgnoreCase("sparseMatrix")) {
				return new SparseMatrix(someArray);
			} else if (threadName.equalsIgnoreCase("PrimaryDiagonal")) {
				return new PrimaryDiagonal(someArray);
			}
			
			
			
			
			
			return null;
		}
	
}
