package com.multithreading.sandbox.tutorials.thread.deadlockProblem;

public class DeadLockProblem {
	
	public static void main (String[] args) {
		
		
		Thread t1 = new Thread(new DangerousClass());
		
		Thread t2 = new Thread(new DangerousClass());
		
		
		t1.start();
		
		t2.start();

	}
	
	

}
