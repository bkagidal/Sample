package com.lab.pc.tree;

public class LCABinarySearchTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(12);

		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);

		int lca = getLCA(root, 10, 4);

		System.out.println("LCA :" + lca);
	}

	private static int getLCA(TreeNode root, int i, int j) {

		while (root != null) {

			if (root.val > i && root.val > j)
				root = root.left;
			else if (root.val < i && root.val < j)
				root = root.right;
			else
				break;
		}

		return root.val;

	}

}
