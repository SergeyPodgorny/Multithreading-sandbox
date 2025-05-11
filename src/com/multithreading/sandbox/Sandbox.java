package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.multithreading.sandbox.benchmarks.benchmark.RunnableTask;
import com.multithreading.sandbox.benchmarks.runnable.FactoryMethod.benchmark.MatrixFactoryLauncher;
import com.multithreading.sandbox.benchmarks.runnable.java1.benchmark.*;

public class Sandbox {

	// this is a global field for every class
	
	
	public static final int MATRIX_SIZE = 49;
	
	
	public static final Executor taskLauncher = Executors.newWorkStealingPool();
	
	
	public static void main(String[] args) throws InterruptedException {
				
		// Single thread

		singleThreadingTime();


		// nested non static classes

		nestedInnerClassesTime();


		// nested static classes

		staticNestedClassesTime();

		// nested anonymous nested non static classes

		anonNestedClassesTime();

		// nested non static classes built by runable interface with lambdas

		runnableWithLambdas();

		// running the task with factory method pattern

		factoryThreading();

		// launching runnable task with Executros class

		executorThreading();

		// launching CompleatableFutrue with ForkJoinCommonPool

		compFutureTest();
		
		
		// 
		
		
	}

	private static void singleThreadingTime() {
		
		Instant startTime1 = Instant.now();
		
		SingleThread nonThreading = new SingleThread();
			
		nonThreading.createSimpleArray();
				
		Instant endTime1 = Instant.now();
				
		System.out.println("Execution time with single thread" + " " + Duration.between(startTime1, endTime1).toMillis());
	}

	
	private static void nestedInnerClassesTime() {
		
		Instant startTime = Instant.now();
		
		NestedClasses multiThreads = new NestedClasses();
		
		multiThreads.createArray();
						
		Instant endTime = Instant.now();
		
		System.out.println("Execution time with nested non static classes" + " " + Duration.between(startTime, endTime).toMillis());
	}
	
	
	private static void anonNestedClassesTime() {
		
		Instant startTime2 = Instant.now();
		
		AnonymousClass anonThreading = new AnonymousClass();
		
		anonThreading.start();
		
		Instant endTime2 = Instant.now();
		
		System.out.println("Execution time with nested anonymous non static classes" + " " + Duration.between(startTime2, endTime2).toMillis());
		
	}
	
	
	private static void staticNestedClassesTime() {
		
		Instant startTime2 = Instant.now();
		
		NestedStaticClasses staticClasses = new NestedStaticClasses();
		
		staticClasses.createArray();
		
		Instant endTime2 = Instant.now();
		
		System.out.println("Execution time with nested static classes" + " " + Duration.between(startTime2, endTime2).toMillis());
		
	}
	
	
	private static void runnableWithLambdas() {
		
		Instant startTime3 = Instant.now();
		
		RunnableWithLambda lambdaThreading = new RunnableWithLambda();
		
		lambdaThreading.start();
		
		Instant endTime3 = Instant.now();
		
		System.out.println("Execution time with nested non static classes built by runable interface with lambdas" + " " + Duration.between(startTime3, endTime3).toMillis());
	}

	private static void compFutureTest() {
		Instant startTime3 = Instant.now();

		var lambdaThreading = new CompFuture();

		var matrix = lambdaThreading.getAMatrix();

		Instant endTime3 = Instant.now();

		System.out.println("Execution time with nested CompleatableFuture" + " " + Duration.between(startTime3, endTime3).toMillis());
	}
	
	
	private static void factoryThreading() {
		
		Instant startTime6 = Instant.now();
		
		MatrixFactoryLauncher launcher = new MatrixFactoryLauncher();
		
		Instant endTime6 = Instant.now();
		
		System.out.println("Execution time with factory pattern and threads" + " " + Duration.between(startTime6, endTime6).toMillis());	
	}
	
	
	
	//TODO refactor this later
	
	
	private static void executorThreading() {
		
		Instant startTime4 = Instant.now();
		
		RunnableTask runnableTask = new RunnableTask();
		
		Instant endTime4 = Instant.now();
		
		System.out.println("Execution time with Executors" + " " + Duration.between(startTime4, endTime4).toMillis());		
		
	}
	
	
	
	
}
