package com.lab.pc.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmalletBST {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(7);
		root.right = new TreeNode(15);

		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(8);

		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(16);

		int res = getElement(root, 3);

		System.out.println(res);

	}

	private static int getElement(TreeNode root, int i) {

		List<Integer> list = inOrder(root);

		return list.get(i - 1);
	}

	private static List<Integer> inOrder(TreeNode root) {

		List<Integer> list = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();

		TreeNode p = root;

		while (!stack.isEmpty() || p != null) {

			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {

				TreeNode t = stack.pop();
				list.add(t.val);
				if (t.right != null)
					p = t.right;
			}
		}

		return list;
	}

}
