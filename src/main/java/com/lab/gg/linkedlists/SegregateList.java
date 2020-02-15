package com.lab.gg.linkedlists;


public class SegregateList {

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
	
	/*
	 *  1. Create 2 new lists one of even and one for odd.
	 *  2. Iterate the list.
	 *  3. if even add to even list else to odd list.
	 *  4. finally join even to odd list and return even. 
	 */
	public Node seggregate(Node head){
		
		Node even = new Node(-1);
		Node temp1 = even;
		Node odd = new Node(-1);
		Node temp2 = odd;
		
		Node temp = head;
		
		while(temp != null){
			
			if(temp.data %2 ==0){
				temp1.next = new Node(temp.data);
				temp1 = temp1.next;
			}else{
				temp2.next = new Node(temp.data);
				temp2 = temp2.next;
			}
			
			temp = temp.next;
		}
		
		temp1.next = odd.next;
		
		return even.next;
	}

	//TODO: Complecated understand this approch
	public Node seggregate2(Node head) {
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		Node end=temp,newend = temp;
		
		
		temp = head;
		
		while(temp != end) {
			
			if(temp.data %2 != 0 && temp != end ) {
				
				newend.next = temp;
				temp = temp.next;
				newend.next.next = null;
				newend = newend.next;
				
			}
		}
		
		
		
		return null;
	}
	public static void main(String[] args) {
		
		SegregateList list = new SegregateList();

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
		
		Node head = list.seggregate(list.head);
		
		Node temp = head;
		
		System.out.println("\n");
		while(temp != null){
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}

}
