package com.lab.gg.linkedlists;

public class PaiWiseSwap {

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

	public void pairwiseSwap() {

		Node temp = head;

		while (temp != null && temp.next != null) {
			swap(temp, temp.next);
			temp = temp.next.next;
		}
	}

	private void swap(Node n1, Node n2) {

		int temp = n1.data;
		n1.data = n2.data;
		n2.data = temp;

	}
	
	public void moveLasttoFirst(){
		
		Node temp = head,prev=null;
		
		while(temp.next != null){
			prev = temp;
			temp = temp.next;
		}
		
		temp.next = head;
		head = temp;
		prev.next = null;
		
		
	}

	public static void main(String[] args) {

		PaiWiseSwap list = new PaiWiseSwap();

		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.append(50);
		list.append(60);
		list.append(70);
		//list.append(80);

		list.printList();
		
		list.moveLasttoFirst();
		//list.pairwiseSwap();
		
		System.out.println("\n");
		list.printList();

	}

}
