package com.lab.pc.linkedlists;

public class OddEvenList {

	public static void main(String[] args) {

		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		ListNode seven = new ListNode(7);
		ListNode eight = new ListNode(8);

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		seven.next = eight;

		printList(one);

		ListNode res = oddEvenList(one);

		System.out.println("\n-----");
		printList(res);
	}

	public static ListNode oddEvenList(ListNode head) {
		if (head == null)
			return head;

		//ListNode result = head;
		ListNode p1 = head;
		ListNode p2 = head.next;
		ListNode connectNode = head.next;

		while (p1 != null && p2 != null) {
			ListNode t = p2.next;
			if (t == null)
				break;

			p1.next = p2.next;
			p1 = p1.next;

			p2.next = p1.next;
			p2 = p2.next;
		}

		p1.next = connectNode;

		return head;
	}

	private static void printList(ListNode head) {

		ListNode cur = head;

		while (cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}

	}
}
