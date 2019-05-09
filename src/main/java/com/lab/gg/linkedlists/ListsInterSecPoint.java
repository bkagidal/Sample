package com.lab.gg.linkedlists;

import java.util.HashSet;

public class ListsInterSecPoint {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void append(int data) {

		Node temp = head;

		Node node = new Node(data);

		if (head == null) {
			head = node;
			return;
		}

		while (temp.next != null)
			temp = temp.next;

		temp.next = node;
	}

	public void printList() {

		Node temp = head;

		while (temp != null) {

			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public int inserSecpoint(Node n1, Node n2) {

		HashSet<Integer> set = new HashSet<>();

		Node temp = n1;

		while (temp != null) {

			set.add(temp.data);
			temp = temp.next;
		}

		Node temp2 = n2;

		while (temp2 != null) {

			if (set.contains(temp2.data))
				return temp2.data;
			temp2 = temp2.next;
		}
		
		if(temp2 == null)
			System.out.println("\n\nNO INTERSECTION");

		return -1;
	}

	public static void main(String[] args) {

		ListsInterSecPoint list1 = new ListsInterSecPoint();
		list1.append(3);
		list1.append(6);
		list1.append(9);
		list1.append(15);
		list1.append(30);

		list1.printList();

		System.out.println("\n");

		ListsInterSecPoint list2 = new ListsInterSecPoint();
		list2.append(10);
		list2.append(15);
		list2.append(30);

		list2.printList();
		
		System.out.println("\n\n"+list1.inserSecpoint(list1.head, list2.head));
		
	}
	
}
