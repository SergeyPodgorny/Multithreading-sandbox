package com.multithreading.sandbox.thread.and.runnable;

public class RunnableWithLambda extends Thread{

	
	private int matrixSize = 49;
	
	private volatile int[][] someArray = new int[matrixSize*matrixSize][matrixSize*matrixSize];

	{
	
		
		
		
	Runnable r1 = () -> {
		System.out.println("lambdas kik azz");
	};
	
	Thread t1 = new Thread(r1);
	t1.start();
	
	
	}
	
}
