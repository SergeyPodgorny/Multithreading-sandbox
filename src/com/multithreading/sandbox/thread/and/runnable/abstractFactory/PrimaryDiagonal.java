package com.multithreading.sandbox.thread.and.runnable.abstractFactory;

import static com.multithreading.sandbox.Sandbox.MATRIX_SIZE;

public class PrimaryDiagonal implements RunnableTask{

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
