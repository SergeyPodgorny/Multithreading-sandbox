package com.multithreading.sandbox.tutorials.thread.deadlockProblem;

public class DangerousClass1{
	
	
	DangerousClass2 dangerousclass2;
	
	
	
	
	public synchronized int getI() {
		return dangerousclass2.getI();
	}
	
	
	private synchronized int returnN() {
		return 2;
	}
	

}
