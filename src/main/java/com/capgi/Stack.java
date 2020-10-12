/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgi;

public class Stack {
	LinkedList linkedList;

	public Stack() {
		this.linkedList = new LinkedList();
	}

	public void push(INode newNode) {
		linkedList.add(newNode);
	}

	public INode peek() {
		return linkedList.getHead();
	}

	public void printStack() {
		linkedList.printLinkedList();
	}
}
