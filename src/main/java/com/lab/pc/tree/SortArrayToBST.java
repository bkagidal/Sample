package com.lab.pc.tree;

public class SortArrayToBST {

	public static void main(String[] args) {

		int[] sorArray = { 1, 2, 3, 4, 5, 6, 7, 8 };

		TreeNode root = sorArrayBST(sorArray, 0, sorArray.length - 1);
		
		display(root, 0);

	}

	private static TreeNode sorArrayBST(int[] sorArray, int start, int end) {

		if (start > end)
			return null;

		int mid = (start + end) / 2;

		TreeNode node = new TreeNode(sorArray[mid]);

		node.left = sorArrayBST(sorArray, start, mid - 1);
		node.right = sorArrayBST(sorArray, mid + 1, end);

		return node;
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
}
