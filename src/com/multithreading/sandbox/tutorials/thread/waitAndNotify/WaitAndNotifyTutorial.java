package com.multithreading.sandbox.tutorials.thread.waitAndNotify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WaitAndNotifyTutorial {
	
	
	public static List<Object> list = Collections.synchronizedList( new ArrayList<>());
	
	
	
	public static void main (String[] args) {
		
		new Writer().start();
		
		new Reader().start();
		
		
		
		
		
	
		
	}
	
	
	

}
