package com.multithreading.sandbox.thread.and.runnable.abstractFactory;

public class MatrixFactoryLauncher {
	
	{
		
		
	MatrixFactory matrixFactory = new MatrixFactory();
	
	matrixFactory.createThread("SparseMatrix").run();
	
	matrixFactory.createThread("PrimaryDiagonal").run();
	
	matrixFactory.createThread("BotttomWidthDiagonal").run();
	
	matrixFactory.createThread("TopWidthDiagonal").run();
	
	matrixFactory.createThread("BotttomHeightDiagonal").run();
	
	matrixFactory.createThread("TopHeightDiagonal").run();
	
	}
}
