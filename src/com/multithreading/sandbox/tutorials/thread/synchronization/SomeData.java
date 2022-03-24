package com.multithreading.sandbox.tutorials.thread.synchronization;

public class SomeData {
	
	public int data;
	
	public void changeData() {
		
		 int data = this.data;	
		 data++;
		 this.data = data;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	
	
	
}
