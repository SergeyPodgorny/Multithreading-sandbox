package com.multithreading.sandbox.tutorials.thread.atomic;

public class AtomicNumbers {

	static int i;
	
	
	public static void main (String[] args) {
		
		for (int j =0; j< 10000; j++) {
			new Thread1().start();
		}
		
		
		
		
		System.out.println(i);
		
	}
	
	public static class Thread1 extends Thread{
		
		@Override
		public void run() {
			i++;
		}
		
	}
	
}
