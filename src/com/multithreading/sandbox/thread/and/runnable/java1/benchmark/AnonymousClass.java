package com.multithreading.sandbox.thread.and.runnable.java1.benchmark;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

import java.util.Arrays;

public class AnonymousClass extends Thread{
	
	
	
	private volatile int[][] someArray = new int[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];
	
	{
	
	new Thread() {
		
		
		// creating sparse array
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
		
	}.start();
	
	new Thread() {
		
		
		
		// primary diagonal
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
		
	}.start();
	
	
	new Thread() {
				
		// TopWidthDiagonal
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
		
	}.start();
	
	
	//BotttomWidthDiagonal
	
	new Thread() {
		
		
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
		
	}.start();
	
	
	//TopHeightDiagonal
	
new Thread() {
		
		
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
	
		
	}.start();
	
	
	
	
	//BottomHeightDiagonal
	new Thread() {
		
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

	}.start();
	
	
	
	
	}
	
	
	public void printer() {
		System.out.println(Arrays.deepToString(someArray).replace("], ", "]\n"));
	}
	
	
	
}