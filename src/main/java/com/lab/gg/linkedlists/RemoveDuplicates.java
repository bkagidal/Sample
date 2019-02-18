package com.lab.gg.linkedlists;

public class RemoveDuplicates {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int ch) {
			this.data = ch;
			next = null;
		}
	}

	public void append(int ch) {

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

	public void removeDuplicates() {

		Node curr = head, next = head.next;

		while (next.next != null) {

			if (curr.data == next.data)
				curr.next = next.next;
			else
				curr = curr.next;

			next = next.next;
		}
	}

	public static void main(String[] args) {

		RemoveDuplicates list = new RemoveDuplicates();

		list.append(11);
		list.append(11);
		list.append(11);
		list.append(21);
		list.append(43);
		list.append(43);
		list.append(60);

		list.printList(list.head);

		list.removeDuplicates();

		System.out.println("\n");

		list.printList(list.head);

	}

}
