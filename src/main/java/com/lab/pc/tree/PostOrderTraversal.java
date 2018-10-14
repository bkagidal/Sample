package com.lab.pc.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

	public static List<Integer> postOrder(TreeNode root) {

		List<Integer> post = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();

		 stack.push(root);

		while (!stack.isEmpty() ) {

			TreeNode node = stack.pop();
			
			stack2.push(node);
;			
			if(node.left != null)
				stack.push(node.left);
			
			if(node.right != null)
				stack.push(node.right);

		}
		
		while(!stack2.isEmpty()){
			
			post.add(stack2.pop().val);
		}

		return post;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<Integer> res = postOrder(root);

		System.out.println(res);
	}

}
