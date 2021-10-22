package com.bl.linkedList;

public class MyNode<K> {
	private K key;
	private MyNode next;

	public MyNode(K Key) {
		this.key = key;
		this.next = null;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
}
