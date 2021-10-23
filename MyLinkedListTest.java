package com.bl.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumbersWhenInsertingNewNodeAfterSecondInBetweenShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myThirdNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myFirstNode);
		INode getNode = myLinkedList.search();
		System.out.println("Search key is :" + " " + getNode.getKey());
		MyNode<Integer> newNode = new MyNode<>(40);
		myLinkedList.insert(getNode, newNode);
		System.out.println("Insert 40 value");
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
