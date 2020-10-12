package com.capgi;

public class Queue {

	LinkedList linkedList;

	public Queue() {
		this.linkedList = new LinkedList();
	}

	public void enqueue(INode newNode) {
		linkedList.append(newNode);
	}

	public INode dequeue() {
		return linkedList.pop();
	}

	public int size() {
		return linkedList.sizeOfList();
	}

	public boolean isEmpty() {
		if (size() > 0) {
			return true;
		} else
			return false;

	}

	public void printQueue() {
		linkedList.printLinkedList();
	}
}
