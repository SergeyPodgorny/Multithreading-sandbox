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
				
				
				list.notify();
				
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		
		
		
		

	}
	
	

}
