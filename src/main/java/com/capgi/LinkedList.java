package com.capgi;

public class LinkedList<K extends Comparable<K>> {
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

	public void insertInBetweenTwoNumbers(INode preNode, INode postNode, INode newNode) {
		preNode.setNext(newNode);
		newNode.setNext(postNode);
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

	public INode<K> searchNode(K value) {
		INode<K> tempNode = getHead();
		while (tempNode != null) {
			if (tempNode.getKey() == value) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public void InsertAfterANode(K value, INode newNode) {
		INode<K> tempNode = searchNode(value);
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);
	}

	public void delete(K value) {
		INode<K> NodeBeforetempNode = getHead();
		INode<K> tempNode = searchNode(value);
		if (tempNode == null) {
			System.out.println("Node not present");
		} else {
			while (NodeBeforetempNode.getNext() != tempNode) {
				NodeBeforetempNode = NodeBeforetempNode.getNext();
			}
			NodeBeforetempNode.setNext(tempNode.getNext());
		}
	}

	public int sizeOfList() {
		INode tempNode = getHead();
		int size = 0;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}

	public void addAndSort(INode newNode) {
		INode tempNode = getHead();
		INode tempNode2 = getHead();
		if (tempNode == null) {
			setHead(newNode);
			setTail(newNode);
		} else if (tempNode != null && tempNode.getKey().compareTo(newNode.getKey()) > 0) {
			setHead(newNode);
			newNode.setNext(tempNode);

		} else {
			while (tempNode != null && tempNode.getKey().compareTo(newNode.getKey()) < 0) {
				tempNode2 = tempNode;
				tempNode = tempNode.getNext();
			}
			newNode.setNext(tempNode);
			tempNode2.setNext(newNode);
			if (tempNode == null) {
				setTail(newNode);
			}

		}

	}

	public void printLinkedList() {
		INode tempNode = this.head;
		while (tempNode != null) {
			System.out.println(tempNode.getKey());
			tempNode = tempNode.getNext();
		}
	}
}
