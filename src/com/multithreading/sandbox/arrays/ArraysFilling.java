package com.multithreading.sandbox.arrays;

import java.time.Duration;
import java.time.Instant;

public class ArraysFilling extends Thread{

	
	private int threadNumber;
	
	
	private int [] someArray = new int[10];
		
	public ArraysFilling(int threadNumber) {
		this.threadNumber = threadNumber;
		
	}
	
		
	
	@Override
	public void run() {
		
//		Instant startTime = Instant.now();	
		for (int i = 0; i < 10; i++) {
			
			someArray[i] = i;
			
			
			
//			System.out.println(i + " " + "from thread " + " " +threadNumber);

		}
		
	}
	
	public void getLength() {
		System.out.println(someArray.length);
	}

}