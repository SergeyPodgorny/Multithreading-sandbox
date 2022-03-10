package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;

import com.multithreading.sandbox.thread.and.runnable.AnonymousClass;
import com.multithreading.sandbox.thread.and.runnable.InnerClass;
import com.multithreading.sandbox.thread.and.runnable.SingleThread;

public class Sandbox {

	public static void main(String[] args) throws InterruptedException {
		
		
		Instant startTime = Instant.now();
		
		InnerClass multiThreads = new InnerClass();
		
		multiThreads.createArray();
						
		Instant endTime = Instant.now();
		
		System.out.println("Execution time with possible memory leaks" + " " + Duration.between(startTime, endTime).toMillis());
		
//		multiThreads.printer();
		
		
		
		Instant startTime1 = Instant.now();
		
		SingleThread nonThreading = new SingleThread();
		
		nonThreading.createSimpleArray();
		
				
		Instant endTime1 = Instant.now();
		
		System.out.println("Execution time with single thread" + " " + Duration.between(startTime1, endTime1).toMillis());
		
//		nonThreading.printer();

//		RunnableWithLambda tr2 = new RunnableWithLambda();
//				
//		tr2.start();
//		
		Instant startTime2 = Instant.now();
		
		AnonymousClass a1 = new AnonymousClass();
		
		a1.start();
		
		Instant endTime2 = Instant.now();
		
		System.out.println("Execution time with anonymous classes" + " " + Duration.between(startTime2, endTime2).toMillis());
	}

	

	
	
}
