package com.lab.gg.linkedlists;

import java.util.HashSet;

public class DetectLoop {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void append(int n) {

		Node temp = head;

		Node node = new Node(n);

		if (head == null) {
			head = node;
			return;
		}

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
	}

	public void printList() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public boolean detectLoop(Node head) {

		HashSet<Node> set = new HashSet<Node>();
		
		while(head != null){
			
			if(set.contains(head))
				return true;
			
			set.add(head);
			head = head.next;
		}
		
		return false;
	}
	
	public boolean detectLoop2(){
		
		Node slow = head,fast = head;
		
		while(slow != null && fast.next != null && fast.next.next != null ){
			
			slow= slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		
		return false;
	}

	public static void main(String[] args) {

		DetectLoop list = new DetectLoop();
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		
		list.head.next.next.next.next = list.head;
		
		System.out.println("\n");
		
		//list.printList();
		
		System.out.println("\nLoop : "+list.detectLoop(list.head));
		
		System.out.println("\nLoop Detect : "+list.detectLoop2());
		
	}

}
