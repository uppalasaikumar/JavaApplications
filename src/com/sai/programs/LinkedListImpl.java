package com.sai.programs;

public class LinkedListImpl {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		System.out.println("head is "+list.head);
		System.out.println(list.size);
		list.display();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(20);
		System.out.println("head is "+list.head.value);
		System.out.println(list.size);
		list.display();
		
		
		list.middleNode();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
