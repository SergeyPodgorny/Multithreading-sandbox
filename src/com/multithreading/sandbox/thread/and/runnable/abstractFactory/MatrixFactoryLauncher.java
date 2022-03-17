package com.multithreading.sandbox.thread.and.runnable.abstractFactory;

public class MatrixFactoryLauncher {
	
	{
		
		
	MatrixFactory matrixFactory = new MatrixFactory();
	
	matrixFactory.createThread("1").run();
	
	matrixFactory.createThread("2").run();
	
	matrixFactory.createThread("3").run();
	
	matrixFactory.createThread("4").run();
	
	matrixFactory.createThread("5").run();
	
	matrixFactory.createThread("6").run();
	
	}
}
