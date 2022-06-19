package com.multithreading.sandbox.tutorials.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicNumbers {

	static int i;
	
	static AtomicInteger I = new AtomicInteger(0);
	
	public static void main (String[] args) {
		
		for (int j =0; j< 1000; j++) {
			new Thread1().start();
		}
		
		System.out.println(Thread.currentThread().getName()+ " "+i);
		
		
		
		for (int j =0; j< 1000; j++) {
			new Thread2().start();
		}
		
		System.out.println(Thread.currentThread().getName()+ " "+ I.get());
		
		
		
	}
	
	public static class Thread1 extends Thread{
		
		@Override
		public void run() {
			i++;
		}
		
	}
	
	public static class Thread2 extends Thread{
		
		@Override
		public void run() {
			I.incrementAndGet();
		}
		
		
	}
	
	
	
}
