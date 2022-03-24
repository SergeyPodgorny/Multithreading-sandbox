package com.multithreading.sandbox.thread.and.runnable.java1.benchmark;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class RunnableWithLambda extends Thread{

	
	
	
	private volatile int[][] someArray = new int[MATRIX_SIZE*MATRIX_SIZE][MATRIX_SIZE*MATRIX_SIZE];

	
	{
	
			
	Runnable r1 = () -> {
		// sparse matrix creation
		for (int i = 0; i < MATRIX_SIZE*MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE*MATRIX_SIZE; j++) {
				if (i==j) {
					someArray[i][j] = 1;
				}
			}
		}
	};
	
	Thread t1 = new Thread(r1);
	t1.start();
	
	
	Runnable r2 = () -> {
		//central diagonal
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
		
		
	};
	
	Thread t2 = new Thread(r2);
	t2.start();
	
	Runnable r3 = () -> {
		
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
	};

	Thread t3 = new Thread(r3);
	t3.start();
	
	
	
	Runnable r4 = () -> {
		
		//BottomWidthDiagonal
		
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
		
	};
	
	Thread  t4 = new Thread(r4);
	t4.start();
	
	
	Runnable r5 = () -> {
		
		//TopHeightDiagonal
		
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
	};
	
	Thread t5 = new Thread(r5);
	t5.start();
	
	
	Runnable r6 = () -> {
		
		//TopHeightDiagonal
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
	};
	
	Thread t6 = new Thread(r6);
	t6.start();
	
	
	}
	
}
