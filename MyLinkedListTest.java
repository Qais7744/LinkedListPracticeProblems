package com.bl.linkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void givenSearchElementShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode getNode = myLinkedList.search();
		System.out.println("Search key is :" + " " + getNode.getKey());
		myLinkedList.printMyNodes();
	}
}
