package com.multithreading.sandbox.tutorials.thread.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class WaitAndNotifyTutorial {
	
	
	public static List<String> list = new ArrayList<>();
	
	
	
	public static void main (String[] args) {
		
		Reader reader = new Reader();
		
		Writer writer = new Writer();
		
		
		
		reader.start();
		
		writer.start();
		
	}
	
	
	

}
