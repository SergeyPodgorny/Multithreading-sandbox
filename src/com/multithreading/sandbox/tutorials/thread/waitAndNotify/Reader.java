package com.multithreading.sandbox.tutorials.thread.waitAndNotify;




import static com.multithreading.sandbox.tutorials.thread.waitAndNotify.WaitAndNotifyTutorial.list;
import java.util.Scanner;

public class Reader extends Thread{
	
	
	
	
	
	@Override
	public void run() {
		
		while(true) {
			
			synchronized (list){
				Scanner scaner = new Scanner(System.in);
				
				list.add(scaner.next());
				
				list.notify();
			}
		}
		
		
		
		
		
		

	}
	
	

}
