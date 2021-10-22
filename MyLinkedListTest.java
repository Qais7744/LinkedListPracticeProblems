package com.bl.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	
	@Test
	public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myThirdNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myFirstNode);
		myLinkedList.pop();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(mySecondNode) &&
						 myLinkedList.head.getNext().equals(myThirdNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
