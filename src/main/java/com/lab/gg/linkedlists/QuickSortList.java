package com.lab.gg.linkedlists;

//TODO: unfinished because of the complexity
public class QuickSortList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void insert(int data) {

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

	public void printList() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	
	public int partition(){
		
		
		return -1;
	}
	public Node getTail(){
		
		Node temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		
		return temp;
	}

	public static void main(String[] args) {
		
		QuickSortList list = new QuickSortList();
		
		list.insert(40);
		list.insert(5);
		list.insert(23);
		list.insert(78);
		list.insert(32);
		list.insert(4);
		list.insert(56);
		list.insert(13);
		list.insert(7);
		list.insert(90);
		
		list.printList();
		
		System.out.println("\n"+((Node)list.getTail()).data);
		

	}

}
