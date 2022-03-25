package com.multithreading.sandbox.tutorials.thread.synchronization;

public class ThreadLauncher extends Thread {
	
	
	SomeData data;

	
	public ThreadLauncher(SomeData data) {
		this.data = data;
	}
	
	
	@Override
	public void run() {
		data.runner();
	}
	

}
