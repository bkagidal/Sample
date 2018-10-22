package com.lab.pc.tree;

public class MaxPathSum {

	static int result = Integer.MIN_VALUE;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(2);
		root.right = new TreeNode(10);

		root.left.left = new TreeNode(-1);
		root.left.right = new TreeNode(-3);

		// root.right.left = new TreeNode(6);
		// root.right.right = new TreeNode(7);

	   maxPathSum(root);
		
		System.out.println(result);
	}

	private static int maxPathSum(TreeNode root) {

		if (root == null)
			return 0;

		int l = maxPathSum(root.left);
		int r = maxPathSum(root.right);

		int maxlr = Math.max(l, r);
		int maxSingle = Math.max(maxlr + root.val, root.val);
		int maxAll = Math.max(maxSingle, l + r + root.val);

		result = Math.max(result, maxAll);

		return maxSingle;
	}

}
