package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;

import com.multithreading.sandbox.thread.and.runnable.FillingWithInnerClass;
import com.multithreading.sandbox.thread.and.runnable.SimpleArrayFilling;

public class Sandbox {

	public static void main(String[] args) throws InterruptedException {
		
//		for (int i = 0; i < 3; i++) {
//			
//			ArraysFilling threadExample = new ArraysFilling(i);
//			
//			threadExample.start();
//			threadExample.getLength();
//
//		}

//		ArraysFilling threadExample = new ArraysFilling(5);
//		
//		threadExample.start();
//		threadExample.getLength();
		
		Instant startTime = Instant.now();
		
		FillingWithInnerClass threader = new FillingWithInnerClass();
		
		threader.createArray();
						
		Instant endTime = Instant.now();
		
		System.out.println("Execution time with not optimised threads" + " " + Duration.between(startTime, endTime).toMillis());
		
		
		
		
		
		Instant startTime1 = Instant.now();
		
		SimpleArrayFilling nonThreading = new SimpleArrayFilling();
		
		nonThreading.createSimpleArray();
		
				
		Instant endTime1 = Instant.now();
		
		System.out.println("Execution time with single thread" + " " +Duration.between(startTime1, endTime1).toMillis());
		
		
		
		
	}

	

	
	
}
