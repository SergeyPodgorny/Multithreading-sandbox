package com.multithreading.sandbox.thread.and.runnable;

public class RunnableWithLambda extends Thread{

	
	private int matrixSize = 49;
	
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];

	
	{
	
			
	Runnable r1 = () -> {
		// sparse matrix creation
		for (int i = 0; i < matrixSize*matrixSize; i++) {
			for (int j = 0; j < matrixSize*matrixSize; j++) {
				if (i==j) {
					someArray[i][j] = 2;
				}
			}
		}
	};
	
	Thread t1 = new Thread(r1);
	t1.start();
	
	
	Runnable r2 = () -> {
		//central diagonal
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
		
		
	};
	
	Thread t2 = new Thread(r2);
	t2.start();
	
	Runnable r3 = () -> {
		
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
	};

	Thread t3 = new Thread(r3);
	t3.start();
	
	
	
	Runnable r4 = () -> {
		
		//BottomWidthDiagonal
		
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
		
	};
	
	Thread  t4 = new Thread(r4);
	t4.start();
	
	
	Runnable r5 = () -> {
		
		//TopHeightDiagonal
		
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
	};
	
	Thread t5 = new Thread(r5);
	t5.start();
	
	
	Runnable r6 = () -> {
		
		//TopHeightDiagonal
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
	};
	
	Thread t6 = new Thread(r6);
	t6.start();
	
	
	}
	
}
