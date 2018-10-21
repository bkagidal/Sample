package com.lab.pc.tree;

public class TreeFromInOreOrder {

	public static void main(String[] args) {

		int[] inOrder = { 4, 2, 5, 1, 6, 7, 3, 8 };
		int inStart = 0;
		int inEnd = inOrder.length-1;

		int[] preOrder = { 1, 2, 4, 5, 3, 7, 6, 8 };
		int pStart = 0;
		int pEnd = preOrder.length-1;

		TreeNode root = buildTree(inOrder, inStart, inEnd, preOrder, pStart, pEnd);

		display(root, 0);

	}

	private static void display(TreeNode p, int level) {

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

	private static TreeNode buildTree(int[] inOrder, int inStart, int inEnd, int[] preOrder, int pStart, int pEnd) {

		if (inStart > inEnd || pStart > pEnd)
			return null;

		int rootVal = preOrder[pStart];
		TreeNode node = new TreeNode(rootVal);

		int k = 0;

		for (int i = 0; i < inOrder.length; i++) {

			if (rootVal == inOrder[i]) {
				k = i;
				break;
			}
		}
		
		int leftSubCnt = (k-inStart);
		int rightSubCnt = (inEnd-k);
		
		node.left = buildTree(inOrder, inStart, inStart+leftSubCnt-1, preOrder, pStart+1, pStart+leftSubCnt);
		node.right = buildTree(inOrder, inStart+leftSubCnt+1, inEnd, preOrder, pStart+leftSubCnt+1, pEnd);

		return node;
	}

}
