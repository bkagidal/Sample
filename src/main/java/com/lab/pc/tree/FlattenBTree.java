package com.lab.pc.tree;

import com.lab.stacks.Stack;

public class FlattenBTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		flatten(root);
	}

	private static void flatten(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		
		TreeNode p = root;
		
		while(p != null || !stack.isEmpty()){
			
			if(p.right != null)
				stack.push(p.right);
			
			if(p.left != null){
				p.right = p.left;
				p.left = null;
			}else{
				TreeNode temp = stack.pop();
				
				p.right = temp;
			}
			
			p = p.right;
		}
				
	}

}
