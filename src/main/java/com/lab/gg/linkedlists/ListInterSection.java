package com.lab.gg.linkedlists;

public class ListInterSection {

	Node head;

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

		while (temp.next != null)
			temp = temp.next;

		temp.next = node;
	}

	public Node intersect(Node l1, Node l2) {

		Node temp = new Node(-1);
		Node finalList = temp;
		while (l1 != null && l2 != null) {
			if (l1.data == l2.data) {
				temp.next = l1;
				temp = temp.next;
				l1 = l1.next;
				l2 = l2.next;
			} else if (l1.data < l2.data)
				l1 = l1.next;
			else
				l2 = l2.next;

		}

		temp.next = null;

		return finalList.next;
	}

	public void printList() {

		Node curr = head;

		while (curr != null) {

			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {

		ListInterSection l1 = new ListInterSection();
		l1.append(1);
		l1.append(2);
		l1.append(3);
		l1.append(4);
		l1.append(6);

		l1.printList();
		System.out.println("\n");
		ListInterSection l2 = new ListInterSection();

		l2.append(2);
		l2.append(4);
		l2.append(6);
		l2.append(8);

		l2.printList();

		System.out.println("\n");
		Node head = l1.intersect(l1.head, l2.head);

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

}
