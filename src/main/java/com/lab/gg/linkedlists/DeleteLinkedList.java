package com.lab.gg.linkedlists;

public class DeleteLinkedList {

	private Node head;

	class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void push(int data) {

		Node node = new Node(data);

		node.next = head;
		head = node;
	}
	
	public void append(int data){
		
		Node n = new Node(data);
		
		if(head == null){
			head = n;
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = n;
		
	}

	public void printList() {
		
		if(head == null)
			System.out.println("\nEmpty List");

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void delete(int data) {

		if (head == null) {
			System.out.println("Empty List");
			return;
		}

		if (head.data == data) {
			head = head.next;
			return;
		} else {

			Node temp = head;
			Node prev = head;
			while (temp != null && temp.data != data) {

				prev = temp;
				temp = temp.next;
			}

			if (temp == null) {
				System.out.println("Element not found");
				return;
			}

			prev.next = temp.next;

		}
	}

	public void deleteAtPos(int pos) {

		int cnt = 0;

		Node temp = head;
		Node prev = null;

		if (head == null) {
			System.out.println("Empty List");
			return;
		}

		if (pos == 0) {
			head = head.next;
			return;
		}

		while (cnt != pos && temp != null) {

			prev = temp;
			temp = temp.next;

			cnt++;
		}
		
		if(temp == null){
			System.out.println("Out of range");
			return;
		}
		
		prev.next = temp.next;

	}
	
	public void deleteList(){
		head = null;
	}

	public static void main(String[] args) {

		DeleteLinkedList list = new DeleteLinkedList();

		/*list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);*/
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);

		//list.delete(1);
		list.delete(8);
		//  list.delete(6);
		 
		
/*		list.deleteAtPos(5);
		list.deleteAtPos(4);
		list.deleteAtPos(1);
*/		
		
	/*	list.printList();
		
		list.deleteList();
		*/
		list.printList();

	}

}
