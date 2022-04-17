package com.multithreading.sandbox.tutorials.thread.waitAndNotify;




import static com.multithreading.sandbox.tutorials.thread.waitAndNotify.WaitAndNotifyTutorial.list;
import java.util.Scanner;

public class Reader extends Thread{
	
	
	
	
	
	@Override
	public void run() {
		
		
		Scanner scaner = new Scanner(System.in);
		
		
		while(true) {
			
			synchronized (list){
				
				
				list.add(scaner.nextLine());
				
				System.out.println(Thread.currentThread().getName());
				list.notify();
				
				
	
			}
		}
		
		
		
		
		
		

	}
	
	

}
