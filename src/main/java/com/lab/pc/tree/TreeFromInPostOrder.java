package com.lab.pc.tree;

public class TreeFromInPostOrder {

	public static void main(String[] args) {

		int[] inOrder = { 4, 2, 5, 1, 6, 7, 3, 8 };
		int inStart = 0;
		int inEnd = inOrder.length;

		int[] postOrder = { 4, 5, 2, 6, 7, 8, 3, 1 };
		int pStart = 0;
		int pEnd = postOrder.length;

		TreeNode root = buildTree(inOrder, inStart, inEnd, postOrder, pStart, pEnd-1);

		display(root, 0);
	}

	private static TreeNode buildTree(int[] inOrder, int inStart, int inEnd, int[] postOrder, int pStart, int pEnd) {

		if (inStart > inEnd || pStart > pEnd)
			return null;

		int rootValue = postOrder[pEnd];
		TreeNode root = new TreeNode(rootValue);

		int k = 0;

		for (int i = 0; i < inOrder.length; i++) {

			if (rootValue == inOrder[i]) {
				k = i;
				break;
			}
		}

		
		root.left = buildTree(inOrder, inStart, k-1, postOrder, pStart, (pStart+k-(inStart+1)));
		root.right = buildTree(inOrder, k+1, inEnd, postOrder, pStart+k-inStart, pEnd-1);
		return root;
	}

	public static void display(TreeNode p, int level) {

		if (p == null)
			return;

		display(p.right, level + 1);
		System.out.println(" ");

		for (int i = 0; i < level; i++)
			System.out.print("  ");

		System.out.print(p.val);
		// System.out.print(" ");
		display(p.left, level + 1);
	}

}
