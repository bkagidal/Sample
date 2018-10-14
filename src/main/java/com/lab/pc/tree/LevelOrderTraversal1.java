package com.lab.pc.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal1 {

	public static List<Integer> levelOrder(TreeNode root) {

		List<Integer> level = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(root);

		while (!queue.isEmpty()) {

			TreeNode node = queue.poll();

			level.add(node.val);

			if (node.left != null)
				queue.offer(node.left);

			if (node.right != null)
				queue.offer(node.right);

		}

		return level;
	}

	public static List<List<Integer>> levelOrder2(TreeNode root) {

		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(root);

		while (!queue.isEmpty()) {

			int levelSize = queue.size();
			List<Integer> level = new ArrayList<>();

			for (int i = 0; i < levelSize; i++) {

				TreeNode node = queue.poll();
				level.add(node.val);

				if (node.left != null)
					queue.offer(node.left);

				if (node.right != null)
					queue.offer(node.right);

			}

			result.add(level);

		}

		return result;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		// List<Integer> res = levelOrder(root);

		List<List<Integer>> res = levelOrder2(root);

		System.out.println(res);
	}

}
