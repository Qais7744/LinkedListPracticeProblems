package com.bl.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void giveElementInsertNewNodeAfterKeyNodeShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.search();
		MyNode<Integer> newNode = new MyNode<>(40);
		myLinkedList.insert(getNode, newNode);
		myLinkedList.deleteInbetween(getNode,myFirstNode);
		myLinkedList.printMyNodes();
		myLinkedList.size();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
}
