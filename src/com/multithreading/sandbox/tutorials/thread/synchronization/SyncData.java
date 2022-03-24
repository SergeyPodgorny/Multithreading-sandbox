package com.multithreading.sandbox.tutorials.thread.synchronization;

public class SyncData {
	
	private int data;

	public SyncData(int data) {
		this.data = data;
	}

	public synchronized int getData() {
		return data;
	}

	public synchronized void setData(int data) {
		this.data = data;
	}
	
	

}
