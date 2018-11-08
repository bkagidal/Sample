package com.lab.pc.tree;

import java.util.Stack;

public class RootToLeafPaths {

	private static Stack<Integer> stack = new Stack<>();

	public static int sum = 0;

	public static void rootToLeafPaths(TreeNode root) {

		if (root == null)
			return;

		stack.push(root.val);

		if (root.left != null) {
			rootToLeafPaths(root.left);
		}

		if (root.left == null && root.right == null) {
			System.out.println("\n");
			for (Integer elem : stack) {
				System.out.print(elem + " ");
				sum += elem;
			}

		}

		if (root.right != null) {
			rootToLeafPaths(root.right);
		}

		stack.pop();
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		TreeNode.display(root, 0);
		// stack.push(root.val);
		rootToLeafPaths(root);

		System.out.println("\n\nSUM :" + sum);

	}

}
