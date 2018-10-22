package com.lab.pc.tree;

public class SymmetricTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);

		root.right.left = new TreeNode(4);
		//root.right.left.left = new TreeNode(5);
		root.right.right = new TreeNode(3);

		System.out.println(isSymmetric(root));

	}

	private static boolean isSymmetric(TreeNode root) {

		if (root == null)
			return true;

		return isSymmetric(root.left, root.right);
	}

	private static boolean isSymmetric(TreeNode left, TreeNode right) {

		if (left == null && right == null)
			return true;
		else if (left == null || right == null)
			return false;

		if (left.val != right.val)
			return false;

		if (!isSymmetric(left.left, right.right))
			return false;

		if (!isSymmetric(left.right, right.left))
			return false;

		return true;

	}

}
