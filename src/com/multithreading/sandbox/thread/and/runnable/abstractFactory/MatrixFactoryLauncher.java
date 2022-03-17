package com.multithreading.sandbox.thread.and.runnable.abstractFactory;

public class MatrixFactoryLauncher {
	
	{
		
		
	MatrixFactory matrixFactory = new MatrixFactory();
	
	matrixFactory.createThread("SparseMatrix").run();
	
	matrixFactory.createThread("PrimaryDiagonal").run();
	
	
	
	}
}
