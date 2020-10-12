package com.capgi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueueTest {
	@Test
	public void enqueueTest() {
		Queue queue = new Queue();
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();

		boolean result = queue.linkedList.getHead().equals(firstNode) && queue.linkedList.getTail().equals(thirdNode);
		assertTrue(result);

	}

	@Test
	public void dequeueTest() {
		Queue queue = new Queue();
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.dequeue();
		queue.printQueue();

		boolean result = queue.linkedList.getHead().equals(secondNode) && queue.linkedList.getTail().equals(thirdNode);
		assertTrue(result);

	}
}
