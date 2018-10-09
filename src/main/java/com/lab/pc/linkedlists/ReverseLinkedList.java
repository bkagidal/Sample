package com.lab.pc.linkedlists;

public class ReverseLinkedList {

	public static void print(ListNode head) {

		ListNode temp = head;
		System.out.println("\n");
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		ListNode seven = new ListNode(7);

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;

		print(one);

		ListNode reverse = reverseList(one);

		print(reverse);

	}

	private static ListNode reverseList(ListNode head) {

		// ListNode dummy = new ListNode(0);

		ListNode cur = head, prev = null, next = null;

		while (cur != null) {
			next = cur.next;

			cur.next = prev;
			prev = cur;
			cur = next;
		}

		return prev;
	}

}
