package com.multithreading.sandbox;

import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;

import com.multithreading.sandbox.arrays.ArraysFilling;

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

		ArraysFilling threadExample = new ArraysFilling(101);
		
		threadExample.start();
		threadExample.getLength();
		
		
		
		
	}

	

	
	
}
