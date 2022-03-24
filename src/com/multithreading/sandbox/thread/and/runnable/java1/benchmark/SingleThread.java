package com.multithreading.sandbox.thread.and.runnable.java1.benchmark;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

import java.util.Arrays;

public class SingleThread {
	
	
	
	
	private volatile int[][] someArray = new int[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];
	
	
	public void createSimpleArray() {
		
		fillArray();
		
	}
	
		
	private void fillArray() {
		
		// creating sparse array
				for (int i = 0; i < MATRIX_SIZE*MATRIX_SIZE; i++) {
					for (int j = 0; j < MATRIX_SIZE*MATRIX_SIZE; j++) {
						if (i==j) {
							someArray[i][j] = 1;
						}
					}
				}
		
				// primaryDiagonal
				// primaryDiagonal
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
			
				//TopWidthDiagonal
				
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
						
						
						//BotWidthDiagonal
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
						
						//ToHeightDiagonal
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
						
						
						//BottomHeightDiagonal
						
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
	
	public void printer () {
		System.out.println(Arrays.deepToString(someArray).replace("], ", "]\n"));
	}
	
}
