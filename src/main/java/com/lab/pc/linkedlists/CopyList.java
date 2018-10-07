package com.lab.pc.linkedlists;

class RandomListNode {
	int val;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.val = x;
		this.next = null;
		this.random = null;
	}

}

public class CopyList {

	public static void print(RandomListNode head) {

		RandomListNode temp = head;
		// System.out.println("\n");
		while (temp != null) {
			System.out.print("|" + temp.val + " " + ((temp.random != null) ? temp.random.val : null) + "|" + "->");
			temp = temp.next;
		}
	}

	public static RandomListNode copy(RandomListNode head) {

		RandomListNode dup = creteDuplicateList(head);

		copyPointers(dup);

		RandomListNode copy = breakList(dup);

		return copy;

	}

	private static RandomListNode breakList(RandomListNode head) {

		RandomListNode cur = head, tmp = head;

		RandomListNode result = cur.next;

		while (cur.next != null) {
			tmp = cur.next;
			cur.next = tmp.next;
			cur = tmp;

		}

		return result;
	}

	private static void copyPointers(RandomListNode head) {

		RandomListNode cur = head;

		while (cur != null) {
			cur.next.random = cur.random.next;
			cur = cur.next.next;
		}

	}

	private static RandomListNode creteDuplicateList(RandomListNode head) {

		RandomListNode cur = head;

		while (cur != null) {

			RandomListNode tmp = new RandomListNode(cur.val);
			tmp.next = cur.next;
			cur.next = tmp;
			cur = tmp.next;

		}
		return head;
	}

	public static void main(String[] args) {

		RandomListNode one = new RandomListNode(1);
		RandomListNode two = new RandomListNode(2);
		RandomListNode three = new RandomListNode(3);
		RandomListNode four = new RandomListNode(4);

		one.next = two;
		two.next = three;
		three.next = four;

		one.random = four;
		four.random = three;
		two.random = one;
		three.random = two;

		System.out.print("Original :  ");
		print(one);

		System.out.println("\n");

		RandomListNode dup = copy(one);
		System.out.print("Dup :  ");
		print(dup);

	}

}
