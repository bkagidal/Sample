package com.lab.pc.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		System.out.println(pathSum(root, 8));
		System.out.println(pathSum1(root, 8));
	}

	private static boolean pathSum1(TreeNode root, int sumVal) {
		
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<Integer> values = new LinkedList<>();
		
		queue.add(root);
		values.add(root.val);
		while(!queue.isEmpty()){
			
			TreeNode curr = queue.poll();
			int val = values.poll();
			
			if(curr.left == null && curr.right == null && val == sumVal)
				return true;
			
			if(curr.left != null){
				queue.add(curr.left);
				values.add(val+curr.left.val);
			}
		
			if(curr.right != null){
				queue.add(curr.right);
				values.add(val+curr.right.val);
			}
		
		}
		
		return false;
	}

	private static boolean pathSum(TreeNode node, int sum) {

		if (node == null)
			return false;

		int subSum = sum - node.val;

		if (subSum == 0 && node.left == null && node.right == null)
			return true;

		return pathSum(node.left, subSum) || pathSum(node.right, subSum);

	}
	
	

}
