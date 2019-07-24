package com.lab.gg.linkedlists;

import java.util.Stack;

class AlternateOddEven1 {

	// class node
	static class Node {
		int data;
		Node next;
	}

	// A utility function to print
	// linked list
	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	// Function to create newNode
	// in a linkedlist
	static Node newNode(int key) {
		Node temp = new Node();
		temp.data = key;
		temp.next = null;
		return temp;
	}

	// Function to insert at beginning
	static Node insertBeg(Node head, int val) {
		Node temp = head;
		while(temp.next != null)
			temp =temp.next;
		
		Node node = new Node();
		node.data = val;
		node.next = null;
		
		temp.next = node;
		
		return head;
	}

	// Function to rearrange the
	// odd and even nodes
	static void rearrangeOddEven(Node head) {
		Stack<Node> odd = new Stack<Node>();
		Stack<Node> even = new Stack<Node>();
		int i = 1;

		while (head != null) {

			if (head.data % 2 != 0 && i % 2 == 0) {

				// Odd Value in Even Position
				// Add pointer to current node
				// in odd stack
				odd.push(head);
			}

			else if (head.data % 2 == 0 && i % 2 != 0) {

				// Even Value in Odd Position
				// Add pointer to current node
				// in even stack
				even.push(head);
			}

			head = head.next;
			i++;
		}

		while (odd.size() > 0 && even.size() > 0) {

			// Swap Data at the top of two stacks
			int k = odd.peek().data;
			odd.peek().data = even.peek().data;
			even.peek().data = k;
			odd.pop();
			even.pop();
		}
	}

	// Driver code
	public static void main(String args[]) {
		Node head = newNode(10);
		head = insertBeg(head, 20);
		head = insertBeg(head, 22);
		head = insertBeg(head, 23);
		head = insertBeg(head, 25);
		head = insertBeg(head, 26);
		head = insertBeg(head, 27);
		head = insertBeg(head, 28);

		System.out.println("Linked List:");
		printList(head);
		rearrangeOddEven(head);

		System.out.println("Linked List after " + "Rearranging:");
		printList(head);
	}
}

// This contributed by Arnab Kundu
