package com.multithreading.sandbox.tutorials.deadlockProblem;

public class DeadLockProblem {
	
	public static void main (String[] args) {
		
		
		
		
		
		
		DangerousClass1 t1 = new DangerousClass1();
		
		DangerousClass2 t2 = new DangerousClass2();
		
		t1.dangerousclass2 = t2;
		
		t2.dangerouscClass1 = t1;
		
		
		t1.start();
		
		t2.start();
				
	
	}
	
	

}
