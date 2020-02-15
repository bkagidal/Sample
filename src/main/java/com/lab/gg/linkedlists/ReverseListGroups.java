package com.lab.gg.linkedlists;

public class ReverseListGroups {

	Node head = null;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void append(int data) {

		Node node = new Node(data);

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

	public void printList() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public Node reverListInGroups(Node node, int k) {

		Node head = node;
		int cnt = k;
		Node prev = null;
		Node cur = head;

		while (head != null && cnt > 0) {

			head = head.next;
			cur.next = prev;
			prev = cur;
			cur = head;
			cnt--;
		}

		if (head != null) {

			node.next = reverListInGroups(head, k);
		}

		return prev;
	}

	public Node getHead() {
		return head;
	}

	public void printList(Node node) {

		Node temp = node;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		ReverseListGroups list = new ReverseListGroups();

		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);

		System.out.println("\n");

		list.printList();

		Node n = list.reverListInGroups(list.getHead(), 3);

		System.out.println("\n");

		list.printList(n);
	}

}
