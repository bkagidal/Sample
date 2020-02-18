package com.lab.gg.linkedlists;

public class DeleteAlternate {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {

		Node temp = head;

		Node node = new Node(data);

		if (head == null) {
			head = node;
			return;
		}

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
	}

	public void printList() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp =temp.next;
		}

	}
	
	public void deleteAlternate() {
		
		Node cur = head;
		Node prev = null;
		
		while(cur.next != null && cur.next.next != null) {
			
			prev = cur;
			cur = cur.next.next;
			prev.next = cur;
		}
		
		cur.next = null;
	}

	public static void main(String[] args) {

		DeleteAlternate list = new DeleteAlternate();

		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		
		list.printList();
		System.out.println("\n");
		list.deleteAlternate();
		list.printList();

	}

}
