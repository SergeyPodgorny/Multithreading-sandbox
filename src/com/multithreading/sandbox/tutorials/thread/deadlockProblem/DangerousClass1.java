package com.multithreading.sandbox.tutorials.thread.deadlockProblem;

public class DangerousClass1 implements Runnable{
	
	
	@Override
	public void run() {
		
		printer1();
		printer2();
		
	}
	
	
	
	public synchronized static void printer1() {
		
		System.out.println("{");
		
	}
	
	
	public synchronized static void printer2() {
		
		System.out.println("}");
		
	}
	
	

}
