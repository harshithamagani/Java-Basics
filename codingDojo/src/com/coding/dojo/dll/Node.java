package com.coding.dojo.dll;

public class Node {
	public int value;
	public Node next;
	public Node previous;
	
	public Node(Integer val) {
		value = val;
		previous = null;
		next = null;
	}

}
