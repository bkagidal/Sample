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

	public boolean searchIterative(int key) {

		Node temp = head;

		while (temp != null) {

			if (temp.data == key)
				return true;

			temp = temp.next;
		}

		return false;
	}

	public boolean searchRecursive(Node node, int key) {

		if (node == null)
			return false;

		if (node.data == key)
			return true;

		return searchRecursive(node.next, key);

	}

	public boolean search(int key) {

		return searchRecursive(head, key);
	}

	public int getNth(int n) {

		int cnt = 1;

		Node temp = head;

		while (temp != null) {
			if (cnt == n)
				return temp.data;
			cnt++;
			temp = temp.next;
		}

		assert (false);

		return 0;
	}

	int cnt = 1;

	private int getNthRec(Node node, int n) {

		if (node == null)
			return 0;

		if (cnt == n)
			return node.data;

		return getNthRec(node.next, n - 1);

	}

	public int getNthRec(int n) {

		return getNthRec(head, n);
	}

	public int getNthFromLast(int n) {

		Node temp = head;

		int len = 0;

		while (temp != null) {
			len++;
			temp = temp.next;
		}

		int cnt = (len - n + 1);
		
		if(n>len){
			System.out.println("Out Of Range Search");
			return -1;
		}
			

		temp = head;

		for (int i = 1; i < cnt; i++)
			temp = temp.next;
		
		
		return temp.data;

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

		System.out.println(list.searchIterative(3));

		System.out.println(list.searchIterative(53));

		System.out.println(list.search(43));

		System.out.println(list.getNth(7));

		System.out.println(list.getNthRec(6));
		
		System.out.println(list.getNthFromLast(7));
	}

}
