package com.lab.pc.tree;

import com.lab.stacks.Stack;

public class BSTIterator {

	Stack<TreeNode> stack = new Stack<>();

	public BSTIterator(TreeNode root) {

		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	public boolean hasNext() {

		return !stack.isEmpty();
	}

	public int next() {
		int result = -1;
		
		if (hasNext()) {
			TreeNode node = stack.pop();
			result = node.val;

			if (node.right != null) {
				node = node.right;
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		BSTIterator itr = new BSTIterator(root);

		// int res = itr.next();

		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());

	}

}
