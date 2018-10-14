package com.lab.pc.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class VerticalOrderTraversal {

	public static List<List<Integer>> verticalOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<>();

		Map<Integer, List<Integer>> data = new HashMap<>();
		Queue<TreeNode> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		int minDis = 0;
		int maxDis = 0;

		q1.offer(root);
		q2.offer(0); // root node level is 0

		while (!q1.isEmpty()) {

			TreeNode node = q1.poll();
			int level = q2.poll();

			minDis = Math.min(minDis, level);
			maxDis = Math.max(maxDis, level);

			if (data.containsKey(level))
				data.get(level).add(node.val);
			else {
				List<Integer> list = new ArrayList<>();
				list.add(node.val);
				data.put(level, list);
			}

			if (node.left != null) {
				q1.offer(node.left);
				q2.offer(level - 1);
			}

			if (node.right != null) {
				q1.offer(node.right);
				q2.offer(level + 1);
			}

			

		}
		
		for (int i = minDis; i <= maxDis; i++)
			res.add(data.get(i));

		return res;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<List<Integer>> res = verticalOrder(root);

		System.out.println(res);
	}

}
