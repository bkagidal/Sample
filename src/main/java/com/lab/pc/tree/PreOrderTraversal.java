package com.lab.pc.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

public class PreOrderTraversal {

	public static List<Integer> preOrder(TreeNode root) {

		List<Integer> pre = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		stack.push(root);

		while (!stack.isEmpty()) {

			TreeNode node = stack.pop();
			pre.add(node.val);

			if (node.right != null)
				stack.push(node.right);

			if (node.left != null)
				stack.push(node.left);
		}

		return pre;
	}
	

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		List<Integer> res = preOrder(root);
		
		System.out.println(res);
	}
	
	
}
