package com.lab.pc.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class VerticalOrderTraversal {

	public static List<Integer> inOrder(TreeNode root) {

		List<Integer> in = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		// stack.push(root);

		TreeNode p = root;
		while (!stack.isEmpty() || p != null) {

			if (p != null) {
				stack.push(p);
				p = p.left;            // Move to left as far as possible
			} else {
				TreeNode t = stack.pop();
				in.add(t.val);

				p = t.right;
			}

		}

		return in;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<Integer> res = inOrder(root);

		System.out.println(res);
	}

}
