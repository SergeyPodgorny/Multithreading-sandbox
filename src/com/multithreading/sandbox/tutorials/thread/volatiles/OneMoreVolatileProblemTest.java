package com.multithreading.sandbox.tutorials.thread.volatiles;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class OneMoreVolatileProblemTest {
	
	
	OneMoreVolatileProblem problem = new OneMoreVolatileProblem();
	
	
	@Test
	void answerShouldBeFourtyTwo() {
		
		assertEquals(42,problem.getNumber());
		
		
	}
	

}
