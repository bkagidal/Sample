package com.lab.gg.linkedlists;

/*
 *   1. Compare 2 nodes if less move temp to next.
 *   2. point current  one to previous pointer.
 *   3. point prev to cur.
 *   4. assign compared pointer to temp.
 */
public class MergeLists {

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

	public Node mergeLists(Node n1, Node n2) {

		if (n1 == null && n2 == null)
			return null;

		Node res = null;

		while (n1 != null && n2 != null) {

			if (n1.data <= n2.data) {
				Node temp = n1.next;
				n1.next = res;
				res = n1;
				n1 = temp;

			} else {
				Node temp = n2.next;
				n2.next = res;
				res = n2;
				n2 = temp;

			}
		}

		while (n2 != null) {
			Node temp = n2.next;
			n2.next = res;
			res = n2;
			n2 = temp;
		}

		while (n1 != null) {
			Node temp = n1.next;
			n1.next = res;
			res = n1;
			n1 = temp;

		}

		return res;

	}

	public static void main(String[] args) {

		MergeLists list1 = new MergeLists();

		list1.append(5);
		list1.append(10);
		list1.append(15);
		list1.append(40);

		list1.printList();

		System.out.println("\n");

		MergeLists list2 = new MergeLists();

		list2.append(2);
		list2.append(3);
		list2.append(20);

		list2.printList();

		Node res = list1.mergeLists(list1.head, list2.head);

		System.out.println("\n");

		Node temp = res;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

}
