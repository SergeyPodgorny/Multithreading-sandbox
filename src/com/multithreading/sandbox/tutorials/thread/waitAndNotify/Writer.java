package com.multithreading.sandbox.tutorials.thread.waitAndNotify;



import static com.multithreading.sandbox.tutorials.thread.waitAndNotify.WaitAndNotifyTutorial.list;



public class Writer extends Thread{

	@Override
	public void run() {
		
		while(list.isEmpty()) {
			
			synchronized(list) {
								
//				list.stream().forEach(System.out::println);
					
				
				
				
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(list.remove(0));
			
			}
			
		}
		

	}
	
	
}
