package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;

import com.multithreading.sandbox.thread.and.runnable.AnonymousClass;
import com.multithreading.sandbox.thread.and.runnable.InnerClass;
import com.multithreading.sandbox.thread.and.runnable.SingleThread;

public class Sandbox {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// Inner non static classes
		Instant startTime = Instant.now();
		
		InnerClass multiThreads = new InnerClass();
		
		multiThreads.createArray();
						
		Instant endTime = Instant.now();
		
		System.out.println("Execution time with possible memory leaks" + " " + Duration.between(startTime, endTime).toMillis());
		

		
		// Single thread
		
		Instant startTime1 = Instant.now();
		
		SingleThread nonThreading = new SingleThread();
		
		nonThreading.createSimpleArray();
		
		Instant endTime1 = Instant.now();
		
		System.out.println("Execution time with single thread" + " " + Duration.between(startTime1, endTime1).toMillis());
		
		
		
		
		// Inner anonymous classes
		
		Instant startTime2 = Instant.now();
		
		AnonymousClass anonThreading = new AnonymousClass();
		
		anonThreading.start();
		
		Instant endTime2 = Instant.now();
		
		System.out.println("Execution time with anonymous classes" + " " + Duration.between(startTime2, endTime2).toMillis());
	}

	

	
	
}
