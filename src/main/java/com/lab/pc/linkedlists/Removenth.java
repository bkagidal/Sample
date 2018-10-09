package com.lab.pc.linkedlists;

public class Removenth {

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

		removenode(one, 1);

		print(one);

	}

	private static void removenode(ListNode one, int i) {

		ListNode cur = one, prev = null;

		int cnt = 0;

		while (cur != null) {
			cnt++;
			cur = cur.next;
		}

		// System.out.println("count : "+cnt);

		int n = (cnt - i);

		cur = one;
		for (int j = 0; j < n; j++) {

			prev = cur;
			cur = cur.next;
		}

		prev.next = cur.next;
	}

}
