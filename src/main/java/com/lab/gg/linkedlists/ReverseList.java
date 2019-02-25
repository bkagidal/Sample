package com.lab.gg.linkedlists;

import com.lab.gg.linkedlists.SwapNodes.Node;

public class ReverseList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void append(int data) {

		Node node = new Node(data);

		if (head == null) {
			head = node;
			return;
		}

		Node curr = head;

		while (curr.next != null)
			curr = curr.next;

		curr.next = node;
	}

	public void printList() {

		Node curr = head;

		while (curr != null) {

			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public void reverseList() {

		Node prev = null;
		Node curr = head;
		Node next = head.next;
		while (curr != null) {
			
			next = curr.next;
			curr.next = prev;
			prev=curr;
			curr = next;
			
		}

		head = prev;
	}

	public static void main(String[] args) {

		ReverseList list = new ReverseList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.append(50);
		list.append(60);
		list.append(70);

		list.printList();
		
		list.reverseList();
		
		System.out.println("\n");
		
		list.printList();

	}

}
