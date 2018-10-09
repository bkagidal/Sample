package com.lab.pc.linkedlists;

public class RemoveListElements {

	public static void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(1);
		ListNode four = new ListNode(3);
		ListNode five = new ListNode(4);
		ListNode six = new ListNode(5);
		ListNode seven = new ListNode(1);

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;

		print(one);

		ListNode res =removeElement(one, 1);

		System.out.println("\n");

		print(res);

	}

	private static ListNode removeElement(ListNode head, int val) {

		ListNode cur = head, prev = null;

		while (cur != null) {

			if (cur.val != val) {

				prev = cur;
			} else {

				if (prev != null)
					prev.next = cur.next;
				else
					head = head.next;
			}

			cur = cur.next;
		}

		return head;
	}

}
