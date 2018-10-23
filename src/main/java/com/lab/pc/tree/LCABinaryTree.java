package com.lab.pc.tree;

public class LCABinaryTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(12);

		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);

		TreeNode node = getLCA(root, 10, 4);

		System.out.println("LCA :" + node.val);

	}

	private static TreeNode getLCA(TreeNode node, int n1, int n2) {

		if (node == null)
			return null;

		if (node.val == n1 || node.val == n2)
			return node;

		TreeNode left = getLCA(node.left, n1, n2);
		TreeNode right = getLCA(node.right, n1, n2);

		if (left != null && right != null)
			return node;

		if (left == null && right == null)
			return null;

		return left != null ? left : right;

	}

}
