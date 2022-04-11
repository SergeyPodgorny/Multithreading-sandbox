package com.multithreading.sandbox.tutorials.thread.deadlockProblem;

public class DeadLockProblem {
	
	public static void main (String[] args) {
		
		
		
		Runnable r1 = () -> {
			DangerousClass1 class1 = new DangerousClass1(); 
		};
		
		Runnable r2 = () -> {
			DangerousClass2 class1 = new DangerousClass2(); 
		};
		
		new Thread(r1).start();
		
		new Thread(r2).start();
		
		
		
		
	
	}
	
	

}
