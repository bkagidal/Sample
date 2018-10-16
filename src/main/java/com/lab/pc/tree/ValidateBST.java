package com.lab.pc.tree;

public class ValidateBST {
	
	private static long prev = Long.MIN_VALUE;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);

		//root.right.left = new TreeNode(3);
		//root.right.right = new TreeNode(6);
		
		System.out.println(isValid(root));
	}

	private static boolean isValid(TreeNode node) {
		
		if(node == null)
			return true;
		
		if(!isValid(node.left))
			return false;
		
		if(prev > node.val)
			return false;
		
		prev = node.val;
		
		if(!isValid(node.right))
			return false;
		
		return true;
	}

}
