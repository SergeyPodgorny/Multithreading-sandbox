package com.multithreading.sandbox.tutorials.thread.synchronization;

public class SomeData {
	
	public int data;
	
	public void changeData() {
		int data = this.data;
		
		if(Thread.currentThread().getName().equals("one")) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e){
				e.printStackTrace();
				
			}
			
		}
			
		 	
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
