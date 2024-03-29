package com.capgi;

public interface INode<K> {
	K getKey();

	INode getNext();

	void setKey(K key);

	void setNext(INode next);

}
