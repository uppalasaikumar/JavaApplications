package com.sai.programs;

public class StackLinkedList {

	Node top ;
	 
	public StackLinkedList() {
		this.top = null;
	}
	
	public void push(int val) {
		Node newval = new Node(val);
		
		if(top==null) {
			top = newval;
			return;
		}
		
		newval.next = top;
		top = newval;
		
		
	}
	
	public Node pop() {
		Node temp = top;
		top = top.next;
		return temp;
	}
	
	public Node peek() {
		return this.top;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void display() {
		Node cur = this.top;
		System.out.print("top ==> ");;
		while(cur!=null) {
			System.out.print(cur.value +" ");
			cur = cur.next;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
