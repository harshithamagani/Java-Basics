package com.coding.dojo.dll;

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		for(int i=1;i<6;i++) {
			Node newNode = new Node(i);
			dll.push(newNode);
		}
		System.out.println("*****print forward********");
		dll.printValuesForward();
		System.out.println("*****print backward********");
		dll.printValuesBackward();
		dll.pop();
		System.out.println("*******testing pop function******");
		dll.printValuesForward();
		System.out.println(dll.contains(2));
		System.out.println(dll.size());
		System.out.println("*******testing insert at function******");
//		Node newNode1= new Node(3);
//		dll.insertAt(newNode1,2);
		dll.printValuesForward();
		dll.removeAt(1);
		dll.printValuesForward();
		
		
		DoublyLinkedList dll2 = new DoublyLinkedList();
		
		Node newNode1 = new Node(2);
		Node newNode3 = new Node(2);
		
		dll2.push(newNode1);
		dll2.push(newNode3);
		System.out.println("******isPalindrome*******");
		System.out.println(dll2.isPalindrome());
	}

}
