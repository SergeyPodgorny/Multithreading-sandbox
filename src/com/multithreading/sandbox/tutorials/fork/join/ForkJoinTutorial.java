package com.multithreading.sandbox.tutorials.fork.join;

import java.util.concurrent.RecursiveAction;

public class ForkJoinTutorial extends RecursiveAction {

	
		static int numOfProcessors = Runtime.getRuntime().availableProcessors();
	
	public static void main(String[] args) {
		
		
		System.out.println(numOfProcessors);
		
		

	}

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
	}

}
