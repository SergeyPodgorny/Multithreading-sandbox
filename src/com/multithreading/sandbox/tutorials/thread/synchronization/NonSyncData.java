package com.multithreading.sandbox.tutorials.thread.synchronization;

public class NonSyncData {
	
	
	private int data;

	public NonSyncData(int data) {
		this.data = data;
	}

	public synchronized int getData() {
		return data;
	}

	public synchronized void setData(int data) {
		this.data = data;
	}
	
	

}
