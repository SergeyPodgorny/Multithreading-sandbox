package com.multithreading.sandbox.benchmarks.runnable.java1.benchmark;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;





public class NestedStaticClasses {

	
private static volatile int[][] someArray = new int[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];
	

	public static void createArray() {
		
		
		SparseMatrix thread1 = new SparseMatrix();
		thread1.start();
		
		PrimaryDiagonal thread2 = new PrimaryDiagonal() ;
		thread2.start();
		
		TopWidthDiagonal thread3 = new TopWidthDiagonal();
		thread3.start();
		
		BotttomWidthDiagonal thread4 = new BotttomWidthDiagonal();
		thread4.start();
		
		TopHeightDiagonal thread5 = new TopHeightDiagonal();
		thread5.start();
		
		BottomHeightDiagonal thread6 = new BottomHeightDiagonal();
		thread6.start();
						
	}
	
	
	
	
	
	
	private static class SparseMatrix extends Thread {
		
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
	
	private static class PrimaryDiagonal extends Thread{
		
		@Override
		public void run() {
			for (int i = MATRIX_SIZE+1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; i++) {
				for (int j = MATRIX_SIZE+1; j <MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; j++) {
					if (i==j) {
						someArray[i][j] = 8;
						if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
							someArray[i][j] = 1;
						}
						
					}
							
				}
				
			}
			
		}
		
		
	}
	
	
	private static class TopWidthDiagonal extends Thread{
		
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
	
	private static class BotttomWidthDiagonal extends Thread{
		
		@Override
		public void run() {
			for (int i = MATRIX_SIZE; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; i++) {
				for (int j = MATRIX_SIZE; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; j++) {
					if (j + 1 == i) {
						someArray[i][j] = 3;
						if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
							someArray[i][j] = 0;
						}
					}
				}
				
			}
		}
		
		
	}
	
	private static class TopHeightDiagonal extends Thread{
		
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
	
	
	private static class BottomHeightDiagonal extends Thread{
		
		@Override
		public void run() {
			for (int i = 1; i < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; i++) {
				for (int j = 1; j < MATRIX_SIZE*MATRIX_SIZE-MATRIX_SIZE-1; j++) {
					if (j + MATRIX_SIZE == i) {
						someArray[i][j] = 5;
						if ((i % MATRIX_SIZE == 3)^(i % MATRIX_SIZE == 0)) {
							someArray[i][j] = 0;
						}
					}
				}
				
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
