package com.multithreading.sandbox.tutorials.thread.deadlockProblem;

public class DeadLockProblem {
	
	public static void main (String[] args) {
		
		
		
		DangerousClass1 t1 = new DangerousClass1();
		
		DangerousClass2 t2 = new DangerousClass2();
		
		t1.start();
		
		t2.start();
		
		
		
		
		
		
	
	}
	
	

}
