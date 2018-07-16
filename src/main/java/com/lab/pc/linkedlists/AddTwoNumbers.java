package com.lab.pc.linkedlists;

class ListNode {

	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		next = null;
	}
}

public class AddTwoNumbers {

	public ListNode addNumbers(ListNode list1, ListNode list2) {

		int cary = 0;

		ListNode sumlist = new ListNode(0);

		ListNode temp = sumlist;

		while (list1 != null || list2 != null) {

			int val1 = (list1 != null) ? list1.val : 0;
			int val2 = (list2 != null) ? list2.val : 0;

			int sum = val1 + val2 + cary;

			cary = sum / 10;

			temp.next = new ListNode(sum % 10);

			temp = temp.next;

			list1 = (list1 != null) ? list1.next : null;
			list2 = (list2 != null) ? list2.next : null;

		}

		if (cary > 0)
			temp.next = new ListNode(cary);

		return sumlist.next;
	}

	public void print(ListNode head) {

		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		AddTwoNumbers sol = new AddTwoNumbers();
		
		ListNode head1 = new ListNode(7);
		head1.next = new ListNode(5);
		head1.next.next = new ListNode(9);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(6);
		
		sol.print(head1);

		System.out.println();

		ListNode head2 = new ListNode(8);
		head2.next = new ListNode(4);
		//head2.next.next = new ListNode(6);

		sol.print(head2);
		System.out.println("\n-----");
		sol.print(sol.addNumbers(head1, head2));
	}

}
