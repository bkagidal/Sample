package com.lab.pc.tree;

public class BalancedBTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		int bal = isBalanced(root);
		System.out.println(bal != -1);

	}

	private static int isBalanced(TreeNode root) {

		if (root == null)
			return 0;

		int lst = isBalanced(root.left);
		int rst = isBalanced(root.right);

		if (lst == -1 || rst == -1)
			return -1;

		if (Math.abs(lst - rst) > 1)
			return -1;
		return 1 + Math.max(lst, rst);
	}

}
