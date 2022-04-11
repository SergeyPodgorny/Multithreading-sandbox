package com.multithreading.sandbox.tutorials.thread.deadlockProblem;

public class DangerousClass2 {

	
	DangerousClass1 dangerouscClass1;
	
	
	public synchronized int getI() {
		return dangerouscClass1.getI();
	}
	
	
	private synchronized int returnN() {
		return 1;
	}
	
	
	
	
}
