package com.multithreading.sandbox.tutorials.thread.waitAndNotify;



import static com.multithreading.sandbox.tutorials.thread.waitAndNotify.WaitAndNotifyTutorial.list;



public class Writer extends Thread{

	@Override
	public void run() {
		
		list.stream().forEach(System.out::println);
		

	}
	
	
}
