package com.multithreading.sandbox.tutorials.thread.volatiles;

public class OneMoreVolatileProblem {
	
	private static boolean isReady;
	private static int number;
	
	
	
	
	private static class Problem extends Thread{
		
		@Override
		public void run() {
			
			while(!isReady) {
				Thread.yield();
			}
			System.out.println(number);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new Problem().start();
		isReady = true;
		number = 42;
		
		System.out.println(getNumber());
		
	}
	
	public static int getNumber() {
		return number;
	}
	
}
