package com.lab.gg.linkedlists;

import java.util.HashSet;
/*
 *  TODO:Practice again
 */
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

	//Sorted List
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

	// unsorted list TODO : Need to Understand this
	public void removeDuplicates2() {

		Node curr = head, prev = head, next = head.next;

		while (curr.next != null) {

			prev = curr;
			next = curr.next;
			while (next != null) {

				if (curr.data == next.data) {
					prev.next = next.next;
				}

				prev = prev.next;
				next = next.next;

			}

			curr = curr.next;
		}

	}

	// Hashing
	public void removeDuplicates3() {

		HashSet<Integer> set = new HashSet<>();

		Node curr = head, prev = head;

		while (curr.next != null) {

			if (set.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				set.add(curr.data);
				prev = curr;

			}

			curr = curr.next;
		}

	}

	public static void main(String[] args) {

		RemoveDuplicates list = new RemoveDuplicates();

		list.append(12);
		list.append(11);
		list.append(12);
		list.append(21);
		list.append(41);
		list.append(43);
		list.append(44);

		list.printList(list.head);

		// list.removeDuplicates();

		list.removeDuplicates2();
		System.out.println("\n");

		list.printList(list.head);

	}

}
