package com.capgi;

public class Node<K extends Comparable<K>> implements INode<K> {

	private K key;
	private Node<K> next;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	@Override
	public void setNext(INode next) {
		this.next = (Node<K>) next;
	}

	public INode<K> getNext() {
		return next;
	}
}
