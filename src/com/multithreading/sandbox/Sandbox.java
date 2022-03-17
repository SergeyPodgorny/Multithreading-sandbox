package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.multithreading.sandbox.executorAPI.RunnabeTasks;
import com.multithreading.sandbox.thread.and.runnable.AnonymousClass;
import com.multithreading.sandbox.thread.and.runnable.InnerClass;
import com.multithreading.sandbox.thread.and.runnable.RunnableWithLambda;
import com.multithreading.sandbox.thread.and.runnable.SingleThread;

public class Sandbox {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// Single thread
		
		singleThread();
		
				
		
		// nested non static classes
		
		Instant startTime = Instant.now();
		
		InnerClass multiThreads = new InnerClass();
		
		multiThreads.createArray();
						
		Instant endTime = Instant.now();
		
		System.out.println("Execution time with nested non static classes" + " " + Duration.between(startTime, endTime).toMillis());
		
		
		// nested anonymous nested non static classes
		
		Instant startTime2 = Instant.now();
		
		AnonymousClass anonThreading = new AnonymousClass();
		
		anonThreading.start();
		
		Instant endTime2 = Instant.now();
		
		System.out.println("Execution time with nested anonymous non static classes" + " " + Duration.between(startTime2, endTime2).toMillis());
		
		
		// inner non static classes built by runable interface with lambdas
		
		Instant startTime3 = Instant.now();
		
		RunnableWithLambda lambdaThreading = new RunnableWithLambda();
		
		lambdaThreading.start();
		
		Instant endTime3 = Instant.now();
		
		System.out.println("Execution time with nested non static classes built by runable interface with lambdas" + " " + Duration.between(startTime3, endTime3).toMillis());
		
		// launching runnable task with Executros class
		
		Instant startTime4 = Instant.now();
		
		Executor f1 = Executors.newFixedThreadPool(3);
		
		Runnable r1 = () -> System.out.println("Hey there");
		
		f1.execute(r1);
		
		Instant endTime4 = Instant.now();
		
		
		
		
	}

	private static void singleThread() {
		
		Instant startTime1 = Instant.now();
		
		SingleThread nonThreading = new SingleThread();
			
		nonThreading.createSimpleArray();
				
		Instant endTime1 = Instant.now();
				
		System.out.println("Execution time with single thread" + " " + Duration.between(startTime1, endTime1).toMillis());
	}

	
	
}
