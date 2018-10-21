package com.lab.pc.tree;

class Node {
	int val;
	Node next;

	Node(int val) {
		this.val = val;
		next = null;
	}
}

public class SortedListToBST {

	private static Node h;

	public static void main(String[] args) {

		Node start = new Node(1);
		start.next = new Node(2);
		start.next.next = new Node(3);
		start.next.next.next = new Node(4);
		start.next.next.next.next = new Node(5);
		//start.next.next.next.next.next = new Node(6);
		//start.next.next.next.next.next.next = new Node(7);
		//start.next.next.next.next.next.next.next = new Node(8);
		h = start;
		int n = getLength(start);

		TreeNode root = sortedListToBST(0, n - 1);

		display(root, 0);

	}

	private static TreeNode sortedListToBST(int start, int end) {
		System.out.println("start :" + start + " end :" + end);

		if (start > end)
			return null;

		int mid = (start + end) / 2;

		System.out.println("Calling sortedListToBST for left with :" + start + " mid " + (mid));
		TreeNode left = sortedListToBST(start, mid - 1);
		TreeNode root = new TreeNode(h.val);
		h = h.next;
		System.out.println("Calling sortedListToBST for right with :" + start + " mid " + (mid));
		TreeNode right = sortedListToBST(mid + 1, end);

		root.left = left;
		root.right = right;

		System.out.println("Root :" + root.val + " left : " + getLeftVal(root) + " right " + getRightVal(root));

		return root;
	}

	public static String getLeftVal(TreeNode node) {

		TreeNode temp = node;

		temp = temp.left;
				
		String str = "";
		while (temp != null) {
			str = str + temp.val + " ";
			temp = temp.left;
		}

		return str;
	}

	public static String getRightVal(TreeNode node) {

		TreeNode temp = node;
		temp = temp.right;
		String str = "";
		while (temp != null) {
			str = str + temp.val + " ";
			temp = temp.right;
		}

		return str;
	}

	public static void display(TreeNode p, int level) {

		if (p == null)
			return;

		display(p.right, level + 1);
		System.out.println(" ");

		for (int i = 0; i < level; i++)
			System.out.print("  ");

		System.out.print(p.val);
		// System.out.print(" ");
		display(p.left, level + 1);
	}

	private static int getLength(Node start) {

		Node p = start;
		int cnt = 0;
		while (p != null) {
			cnt++;
			p = p.next;
		}
		return cnt;
	}

}
