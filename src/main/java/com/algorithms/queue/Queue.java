package com.algorithms.queue;

public class Queue {

	private int [] queue;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public Queue() {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		queue = new int[size];
	}
	
	public Queue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		queue = new int[this.size];
	}
	
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		} else {
			total++;
			queue[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
	}
	
	public int dequeue() {
		int item = queue[front];
		total--;
		front = (front + 1) % size;
		return item;
	}
	
	public boolean isFull() {
		
		return (size == total) ? true : false; 
	}
}
