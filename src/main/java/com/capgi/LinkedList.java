package com.capgi;

public class LinkedList<K> {
	private INode head;
	private INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode getHead() {
		return head;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public INode getTail() {
		return tail;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}

	}

	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = this.tail;
		INode tempNodeHead = this.head;
		while (tempNodeHead.getNext().getNext() != null) {
			tempNodeHead = tempNodeHead.getNext();
		}
		this.tail = tempNodeHead;
		tempNodeHead.setNext(null);
		return tempNode;
	}

	public void printLinkedList() {
		INode tempNode = this.head;
		while (tempNode != null) {
			System.out.println(tempNode.getKey());
			tempNode = tempNode.getNext();
		}
	}
}
