package com.multithreading.sandbox.tutorials.deadlockProblem;

public class DangerousClass2 extends Thread {

	
	DangerousClass1 dangerouscClass1;
	
	@Override
	public void run() {
		getI();
	}
	
	
	
	public synchronized void getI() {
		dangerouscClass1.getI();
	}
	
	
	private synchronized void returnN() {
		System.out.println("1");
	}
	
	
	
	
}
