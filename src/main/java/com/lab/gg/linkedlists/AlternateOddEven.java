package com.lab.gg.linkedlists;

// 06242019
//Odd and Even Nodes Should be alternate in Single Linked list.
//1. Start with odd position verify its data get if it needs to be swapped(means data is even).
//2. collect next element which is not in correct position.
//3. swap these two elements.
//     1. find p1 and c1, p2 and c2
//     2. p1 nex to c2 , p2 next to c1
//     3. Now connect the broken links reg swap.

public class AlternateOddEven {

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

	public void oddeven(Node head) {

		Node temp = head;

		boolean oddPos = true;

		int swap1 = -1;
		int swap2 = -1;


		while (temp != null) {

			int data = temp.data;
			
			//System.out.println("data "+data +" odd "+oddPos);

			if (oddPos && (data % 2 == 0)) {
				swap1 = data;
			} else if (!oddPos && (data % 2 != 0)) {
				swap2 = data;
			}

			if (swap1 != -1 && swap2 != -1) {
				
				//System.out.println("\nSwapping :"+ swap1 + " "+swap2);

				swap(swap1, swap2);
				
				//printList();
				
				swap1 = -1;
				swap2 = -1;
				temp = temp.next;
			}

			oddPos = !oddPos;

			temp = temp.next;
		}


	}

	public void swap(int s1, int s2) {

		if (s1 == s2)
			return;

		Node prev1 = null, curr1 = head;

		while (curr1 != null && curr1.data != s1) {
			prev1 = curr1;
			curr1 = curr1.next;
		}

		Node prev2 = null, curr2 = head;

		while (curr2 != null && curr2.data != s2) {

			prev2 = curr2;
			curr2 = curr2.next;
		}

		if (curr1 == null || curr2 == null)
			return;

		if (prev1 != null)
			prev1.next = curr2;
		else
			head = curr2;

		if (prev2 != null)
			prev2.next = curr1;
		else
			head = curr1;

		
		Node temp = curr1.next;
		curr1.next = curr2.next;
		curr2.next = temp;
	}
	
	public static void main(String[] args) {
		
		AlternateOddEven list = new AlternateOddEven();
		
		list.append(11);
		list.append(20);
		list.append(40);
		list.append(55);
		list.append(77);
		list.append(80);

		list.printList();
		
		list.oddeven(list.head);
		
		System.out.println("\n");
		list.printList();
		
		/*AlternateOddEven list2 = new AlternateOddEven();
		
		list2.append(10);
		list2.append(1);
		list2.append(2);
		list2.append(3);
		list2.append(5);
		list2.append(6);
		list2.append(7);
		list2.append(8);

		list2.printList();
		
		list2.oddeven(list2.head);
		
		System.out.println("\n");
		list2.printList();*/
		/*
		AlternateOddEven list2 = new AlternateOddEven();
		
		list2.append(1);
		list2.append(3);
		list2.append(5);
		list2.append(7);
		list2.append(9);
		list2.append(11);
		list2.append(13);
		list2.append(15);

		list2.printList();
		
		list2.oddeven(list2.head);
		
		System.out.println("\n");
		list2.printList();*/
	}

}
