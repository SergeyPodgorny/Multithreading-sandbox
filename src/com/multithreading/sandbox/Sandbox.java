package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;

import com.multithreading.sandbox.thread.and.runnable.AnonymousClass;
import com.multithreading.sandbox.thread.and.runnable.InnerClass;
import com.multithreading.sandbox.thread.and.runnable.RunnableWithLambda;
import com.multithreading.sandbox.thread.and.runnable.SingleThread;

public class Sandbox {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// Single thread
		
		Instant startTime1 = Instant.now();
				
		SingleThread nonThreading = new SingleThread();
			
		nonThreading.createSimpleArray();
				
		Instant endTime1 = Instant.now();
				
		System.out.println("Execution time with single thread" + " " + Duration.between(startTime1, endTime1).toMillis());
		
				
		
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
		
		System.out.println("Execution time with nested anonymous nested non static classes" + " " + Duration.between(startTime2, endTime2).toMillis());
		
		
		// inner non static classes built by runable interface with lambdas
		
		Instant startTime3 = Instant.now();
		
		RunnableWithLambda lambdaThreading = new RunnableWithLambda();
		
		lambdaThreading.start();
		
		Instant endTime3 = Instant.now();
		
		System.out.println("Execution time inner non static classes built by runable interface with lambdas" + " " + Duration.between(startTime3, endTime3).toMillis());
		
	}

	

	
	
}
