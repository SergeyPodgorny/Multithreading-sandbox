package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;

import com.multithreading.sandbox.executorAPI.java7.benchmark.RunnableTask;
import com.multithreading.sandbox.thread.and.runnable.java1.benchmark.AnonymousClass;
import com.multithreading.sandbox.thread.and.runnable.java1.benchmark.InnerClass;
import com.multithreading.sandbox.thread.and.runnable.java1.benchmark.RunnableWithLambda;
import com.multithreading.sandbox.thread.and.runnable.java1.benchmark.SingleThread;

public class Sandbox {

	// this is a global field for every class
	public static final int MATRIX_SIZE = 49; 
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
		// Single thread
		
		singleThreadingTime();
		
		
		// nested non static classes
		
		nestedInnerClassesTime();
		
		// nested anonymous nested non static classes
		
		anonInnerClassesTime();
		
		// inner non static classes built by runable interface with lambdas
		
		runnableWithLambdas();
		
		// launching runnable task with Executros class
		
		method1();
		
		
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
		
		InnerClass multiThreads = new InnerClass();
		
		multiThreads.createArray();
						
		Instant endTime = Instant.now();
		
		System.out.println("Execution time with nested non static classes" + " " + Duration.between(startTime, endTime).toMillis());
	}
	
	
	private static void anonInnerClassesTime() {
		
		Instant startTime2 = Instant.now();
		
		AnonymousClass anonThreading = new AnonymousClass();
		
		anonThreading.start();
		
		Instant endTime2 = Instant.now();
		
		System.out.println("Execution time with nested anonymous non static classes" + " " + Duration.between(startTime2, endTime2).toMillis());
		
	}
	
	
	private static void runnableWithLambdas() {
		
		Instant startTime3 = Instant.now();
		
		RunnableWithLambda lambdaThreading = new RunnableWithLambda();
		
		lambdaThreading.start();
		
		Instant endTime3 = Instant.now();
		
		System.out.println("Execution time with nested non static classes built by runable interface with lambdas" + " " + Duration.between(startTime3, endTime3).toMillis());
	}
	
	//TODO refactor this later
	
	
	private static void method1() {
		
		Instant startTime4 = Instant.now();
		
		RunnableTask task4 = new RunnableTask();
		
		Instant endTime4 = Instant.now();
		
		System.out.println("Execution time with executor API" + " " + Duration.between(startTime4, endTime4).toMillis());		
		
	}
	
	
	
	
}
