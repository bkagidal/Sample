package com.lab.gg.linkedlists;

public class LinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void push(int newData) {

		Node temp = new Node(newData);
		temp.next = head;
		head = temp;

	}

	public void insertAfter(Node previousNode, int data) {

		Node newNode = new Node(data);

		if (previousNode == null) {
			head = newNode;
			return;
		}

		newNode.next = previousNode.next;
		previousNode.next = newNode;

	}

	public void append(int data) {

		Node nNode = new Node(data);

		if (head == null) {
			head = nNode;
			return;
		}

		Node temp = head;

		while (temp.next != null)
			temp = temp.next;

		temp.next = nNode;
	}

	public void printList() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public int length() {

		int len = 0;

		Node temp = head;

		while (temp != null) {
			len++;
			temp = temp.next;
		}

		return len;
	}

	int recLen = 0;
	
	public void lenghtRecursive(Node head) {

		if (head == null)
			return;
		recLen++;
		lenghtRecursive(head.next);
	}

	public int getCountRec(Node node) {

		if (node == null)
			return 0;

		return 1 + getCountRec(node.next);
	}

	public int getCountRec() {

		return getCountRec(head);
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.push(1);
		list.push(2);
		list.push(3);

		list.insertAfter(list.head, 33);

		list.append(99);
		list.append(100);

		list.printList();

		System.out.println("\nList Length :" + list.length());

		list.lenghtRecursive(list.head);

		System.out.println("\nList Length Recusrsive:" + list.recLen);
		
		System.out.println("\nList Length Recusrsive:" + list.getCountRec());
	}

}
