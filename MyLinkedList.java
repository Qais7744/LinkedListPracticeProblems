package com.bl.linkedList;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode search() {
		INode tempNode = head;
		while (!tempNode.getKey().equals(30)) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public void deleteInbetween(INode getNode, INode setNode) {
		INode temp = this.head;
		getNode.setNext(setNode);
	}

	public void size() {
		int i = 0;
		final int ONE = 1;
		INode temp = this.head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			i++;
		}
		System.out.println("Number of Nodes is: " + (i + ONE));
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
