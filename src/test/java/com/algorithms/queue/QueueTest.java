package com.algorithms.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	Queue queue;
	
	@Before
	public void setUp() {
		queue = new Queue(10);
	}
	
	@Test
	public void shouldReturnThreeValues() {
		
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(6);
		
		Assert.assertEquals(3, queue.dequeue());
		Assert.assertEquals(4, queue.dequeue());
		Assert.assertEquals(6, queue.dequeue());
	}
}
