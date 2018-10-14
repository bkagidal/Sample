package com.lab.pc.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		// TreeNode invert = invert1(root);

		TreeNode invert = invert2(root);

		print(invert);

	}

	// Iterative
	private static TreeNode invert2(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode node = queue.poll();

			if (node.left != null)
				queue.add(node.left);

			if (node.right != null)
				queue.add(node.right);

			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;

		}

		return root;
	}

	private static void print(TreeNode node) {

		if (node == null)
			return;

		System.out.print(node.val + " ");

		if (node.left != null)
			print(node.left);
		if (node.right != null)
			print(node.right);

	}

	private static TreeNode invert1(TreeNode root) {

		if (root != null)
			helper(root);

		return root;
	}

	private static void helper(TreeNode node) {

		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;

		if (node.left != null)
			helper(node.left);

		if (node.right != null)
			helper(node.right);
	}

}
