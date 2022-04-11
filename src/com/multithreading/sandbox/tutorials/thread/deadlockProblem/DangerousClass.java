package com.multithreading.sandbox.tutorials.thread.deadlockProblem;

public class DangerousClass implements Runnable{
	
	
	@Override
	public void run() {
		
		printer1();
		printer2();
		
	}
	
	
	
	public static void printer1() {
		
		System.out.println("{");
		
	}
	
	
	public static void printer2() {
		
		System.out.println("}");
		
	}
	
	

}
