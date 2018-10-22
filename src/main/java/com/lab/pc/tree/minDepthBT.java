package com.lab.pc.tree;

public class minDepthBT {


	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		int minDepth = minDepth(root);

		System.out.println(minDepth);

	}

	private static int minDepth(TreeNode node) {

		if (node == null)
			return 0;

		if (node.left == null)
			return 1 + minDepth(node.left);

		if (node.right == null)
			return 1 + minDepth(node.right);

		return 1 + Math.min(minDepth(node.left), minDepth(node.right));

	}

}
