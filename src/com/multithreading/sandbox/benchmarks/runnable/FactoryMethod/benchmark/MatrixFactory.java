package com.multithreading.sandbox.benchmarks.runnable.FactoryMethod.benchmark;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class MatrixFactory {

	
	private volatile double [][] someArray = new double[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];
	
		public RunnableTask createThread(String threadName) {
			
			if(threadName.equalsIgnoreCase("1")) {
			
				return new SparseMatrix(someArray);
			
			} else if (threadName.equalsIgnoreCase("2")) {
			
				return new PrimaryDiagonal(someArray);
			
			} else if(threadName.equalsIgnoreCase("3")) {
				
				return new BotttomWidthDiagonal(someArray);
				
			} else if(threadName.equalsIgnoreCase("4")) {
			
				return new TopWidthDiagonal(someArray);
				
			} else if(threadName.equalsIgnoreCase("5")) {
			
				return new TopHeightDiagonal(someArray);
				
			} else if(threadName.equalsIgnoreCase("6")) {
			
				return new BottomHeightDiagonal(someArray);
				
			} 
				return null;
			}
			
			
			
			
			
			
		
	
}
