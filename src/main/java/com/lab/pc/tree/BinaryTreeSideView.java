package com.lab.pc.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeSideView {

	public static void main(String[] args) {

		List<Integer> leftView = new ArrayList<>();
		List<Integer> rightView = new ArrayList<>();

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		sideViews(root, leftView, rightView);
		
		System.out.println("Left View  :"+leftView);
		System.out.println("Right View :"+rightView);

	}

	private static void sideViews(TreeNode root, List<Integer> leftView, List<Integer> rightView) {

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();

				if (i == 0 ){
					leftView.add(node.val);
				}
				
				if (i == size - 1)
					rightView.add(node.val);

				if (node.left != null)
					queue.add(node.left);

				if (node.right != null)
					queue.add(node.right);
			}
		}
	}

}
