package com.lab.pc.linkedlists;

import java.util.ArrayList;
import java.util.List;

class StringNode {

	String val;
	StringNode next;

	public StringNode(String val) {
		this.val = val;
		next = null;
	}
}

public class ListIntersection {

	public static void print(StringNode head) {

		StringNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		StringNode list1 = new StringNode("a1");
		StringNode two = new StringNode("a2");
		StringNode three = new StringNode("c1");
		StringNode four = new StringNode("c2");
		StringNode five = new StringNode("c3");

		list1.next = two;
		two.next = three;
		three.next = four;
		four.next = five;

		System.out.println("\n");

		print(list1);

		StringNode list2 = new StringNode("b1");
		StringNode two1 = new StringNode("b2");
		StringNode three1 = new StringNode("b3");
		StringNode four1 = new StringNode("b4");
		StringNode five1 = new StringNode("c2");
		StringNode five2 = new StringNode("c2");

		list2.next = two1;
		two1.next = three1;
		three1.next = four1;
		four1.next = five1;
		five1.next = five2;

		System.out.println("\n");

		print(list2);

		String res = findintersect(list1, list2);

		System.out.println("\nIntersection : " + res);
	}

	private static String findintersect(StringNode list1, StringNode list2) {

		List<String> list = new ArrayList<>();

		while (list1 != null) {

			list.add(list1.val);
			list1 = list1.next;
		}

		while (list2 != null) {

			if (list.contains(list2.val))
				return list2.val;

			list2 = list2.next;
		}

		return null;
	}

}
