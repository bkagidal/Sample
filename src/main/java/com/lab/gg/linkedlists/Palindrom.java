package com.lab.gg.linkedlists;

public class Palindrom {

	Node head;
	Node slow_ptr, fast_ptr, second_half;

	class Node {

		char data;
		Node next;

		Node(char ch) {
			this.data = ch;
			next = null;
		}
	}

	public void appen(char ch) {

		Node node = new Node(ch);

		if (head == null) {
			head = node;
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
	}

	public void printList(Node head) {
		Node temp = head;

		while (temp != null) {

			System.out.print(temp.data + " ");

			temp = temp.next;
		}

	}

	public Node splitList() {

		slow_ptr = head;
		fast_ptr = head;

		Node prev_of_slow_ptr = head;
		Node midnode = null; // To handle odd size list

		while (fast_ptr != null && fast_ptr.next != null) {

			fast_ptr = fast_ptr.next.next;
			prev_of_slow_ptr = slow_ptr;
			slow_ptr = slow_ptr.next;
		}

		if (fast_ptr != null) {
			midnode = slow_ptr;
			slow_ptr = slow_ptr.next;
		}

		second_half = slow_ptr;
		prev_of_slow_ptr.next = null;

		return reverseList(second_half);
	}

	private Node reverseList(Node head) {

		Node prev = null;
		Node current = head, next = head;

		while (next != null) {
			next = next.next;
			current.next = prev;
			prev = current;
			current = next;

		}

		return prev;
	}

	public boolean isPalidrom() {

		Node first = head;
		Node second = splitList();

		while (first != null && second != null) {

			if (first.data != second.data) 
				return false;
			
			first = first.next;
			second = second.next;
		}
		return true;
	}

	public static void main(String[] args) {

		Palindrom list = new Palindrom();

		list.appen('R');
		list.appen('A');
		list.appen('D');
		list.appen('A');
		list.appen('R');
		//list.appen('k');

		list.printList(list.head);

		/*
		 * Node first = list.head; Node second = list.splitList();
		 * 
		 * System.out.println("\n"); list.printList(first);
		 * System.out.println("\n"); list.printList(second);
		 */

		System.out.println("\n\n" + list.isPalidrom());

	}

}
