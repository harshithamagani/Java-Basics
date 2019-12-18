package com.coding.dojo.dll;

public class DoublyLinkedList {
	public Node head;
	public Node tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Adds new Node to the end of the list
	public void push(Node newNode) {
		if (head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}

	public void printValuesForward() {
		Node runner = this.head;
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}
	
	public void printValuesBackward() {
		Node runner = this.tail;
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.previous;
		}
	}
	
	public Node pop() {
		Node current = this.tail;
		current.previous.next=null;
		return current;
	}
	
	public boolean contains(int value){
		Node first = this.head;
		Node last = this.tail;
		
		while(first != null && last!=null) {
			System.out.println("here");
				if(first.value == value || last.value==value) {
					return true;
				}
				first= first.next;
				last = last.previous;
		}
		return false;	
	}
	
	public int size() {
		Node runner = this.head;
		int count = 0;
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
			count++;
		}
		return count;
	}
	
	public void insertAt(Node newNode,int index) {
		int count = 1;
		Node runner = this.head;
		while(runner.next != null && count!=index) {
			count++;
			runner = runner.next;
		}
		if(runner.previous != null) {
			System.out.println(runner.value);
			System.out.println(runner.previous.value);
			runner.previous.next=newNode;
			newNode.previous=runner.previous;
			newNode.next=runner;
		}
		else {
			runner.previous=newNode.next;
			newNode.next=runner;
			this.head = newNode;
		}
	}

	
	public void removeAt(int index) {
		int count = 1;
		Node runner =  this.head;
		while(runner.next != null && count != index) {
			count++;
			runner = runner.next;
		}
		if(runner.previous != null) {
			System.out.println(runner.value);
			runner.previous.next = runner.next;
			runner.next.previous = runner.previous;
		}
		else {
			this.head = runner.next;
			runner.next.previous=null;
		}
	}
	
	public boolean isPalindrome() {
		Node first =  this.head;
		Node last =this.tail;
		while(first!= last && first.next != last) {
			if(first.value == last.value) {
				first = first.next;
				last = last.previous;
			}
			else {
				return false;
			}
		}
		return true;	
	}
	 
}


