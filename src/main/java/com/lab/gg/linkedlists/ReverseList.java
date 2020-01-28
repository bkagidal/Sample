package com.lab.gg.linkedlists;

/*
 * 01282020
 * 1. Move the next pointer first.
 * 2. adjust the link so that cur link should point to previous one.
 * 3. Make the prev as current.
 * 4. Lastly move the current pointer to next. 
 * 5. You can user also recursion to just print list.
 */
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
			prev = curr;
			curr = next;

		}

		head = prev;
	}

	public void printReverse() {
		printRev(head);
	}

	private void printRev(Node node) {

		if (node == null)
			return;
		printRev(node.next);

		System.out.print(node.data + " ");
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

		// list.reverseList();

		System.out.println("\n");

		list.printReverse();

		System.out.println("\n");

		// list.printList();

	}

}
