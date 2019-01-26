package com.sai.programs;

public class StackImpl {

	public static void main(String args[]) {
		
		StackLinkedList stack = new StackLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		
		System.out.println("\npeek value "+ stack.peek().value);
		
		System.out.println("pop value " +stack.pop().value);
		
		stack.display();
		
		System.out.println("\n"+stack.isEmpty());
	}
	
}
