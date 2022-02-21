package com.multithreading.sandbox.thread.and.runnable;

public class SimpleArrayFilling {
	
	
	private int length = 49*49;
	
	private int[] someArray = new int[length]; 
	
	
	public void createSimpleArray() {
		createSparseArray();
		fillArray();
	}
	
	private void createSparseArray() {
		for (int i = 0; i < length; i++) {
			someArray[i] = 0;
		}
	}

	private void fillArray() {
		for (int i = 0; i < length; i++) {
			
			if (i % 5 == 0) {
				someArray[i] = 5;
			}
			
			
		}
	}
	
	public void printer() {
		for (int i = 0; i < length; i++) {
			System.out.println(someArray[i]);
		}
	}
}
