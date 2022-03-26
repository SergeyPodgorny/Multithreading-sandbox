package com.multithreading.sandbox.tutorials.thread.runnablesSynchronization;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorStaticSynchro {
	
	
		
	
	public static void main(String[] args) {
		
		Executor taskLauncher = Executors.newFixedThreadPool(2);
		
		
		Runnable r1 = () ->{
			
			synchronized (ExecutorStaticSynchro.class){
				System.out.println("{");
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("}");
			}
		};
		
		taskLauncher.execute(r1);
		
		
		
	}

}
