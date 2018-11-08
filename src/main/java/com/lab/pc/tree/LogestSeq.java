package com.lab.pc.tree;

public class LogestSeq {

	private static int res = 0;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		// root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(4);

		// root.right.left = new TreeNode(6);
		root.right.right.right = new TreeNode(5);
		//root.right.right.right.right = new TreeNode(6);

		logestSequenceLen(root, 0, 0);

		System.out.println(res);
	}
	
	/*
	 *  longest consecutive path would be in sequnce like 1-2-3. so we know next value
	 *  should be one grater. compare with expected value if its 1 more than current increase
	 *  pathlen by 1 else reset to 1.
	 */

	private static void logestSequenceLen(TreeNode node, int expected, int pathLen) {

		if (node == null)
			return;

		if (node.val == expected)
			pathLen++;
		else
			pathLen = 1;

		res = Math.max(pathLen, res);

		logestSequenceLen(node.left, node.val + 1, pathLen);
		logestSequenceLen(node.right, node.val + 1, pathLen);

	}

}
