package com.algorithms.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	Stack stack;

	@Before
	public void setUp() {
		stack = new Stack();
	}
	
	@Test
	public void shouldReturn4Values() {
		
		if(!stack.isFull()) {
			stack.push(2);
			stack.push(4);
			stack.push(6);
			stack.push(9);
		}
		
		Assert.assertEquals(9, stack.pop());
		Assert.assertEquals(6, stack.pop());
		Assert.assertEquals(4, stack.pop());
		Assert.assertEquals(2, stack.pop());
		Assert.assertTrue(stack.isEmpty());
	}
}
