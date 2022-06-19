package com.multithreading.sandbox.tutorials.deadlockProblem;

public class DangerousClass1 extends Thread {
	
	
	DangerousClass2 dangerousclass2;
	
	@Override
	public void run() {
		getI();
	}
	
	
	public synchronized void getI() {
		dangerousclass2.getI();
	}
	
	
	private synchronized void returnN() {
		System.out.println("2");
	}
	

}
