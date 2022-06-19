package com.multithreading.sandbox.tutorials.synchronization;

public class NonStaticMethodWithBlock implements Runnable {
	
	
	public void run() {
		methodWithCodeBlock();
	}
	
	
	
	private void methodWithCodeBlock() {
		
		// в данном случае простое добавление optional specifier не поможет, нужна привязка к "монитору метода". Для этого используется ключевое слово this 
		
	synchronized (this)	{
			System.out.println("{");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("}");
			
		}
		
		
	}
	
	

}
