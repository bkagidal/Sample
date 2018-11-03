package com.lab.pc.tree;

class TreeNodeNext {
	int val;
	TreeNodeNext left;
	TreeNodeNext right;
	TreeNodeNext next;

	public TreeNodeNext(int val) {
		this.val = val;
		left = null;
		right = null;
		next = null;
	}

}

public class PopulateNextRightPointers {

	private static void display(TreeNodeNext p, int level) {

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

	private static void populateRight(TreeNodeNext root) {

		TreeNodeNext top = root;

		while (top != null) {

			TreeNodeNext cur = top;

			while (cur != null) {
				if (cur.left != null)
					cur.left.next = cur.right;

				if (cur.right != null && cur.next != null)
					cur.right.next = cur.next.left;
				cur = cur.next;
			}
			top = top.left;

		}
	}

	public static void main(String[] args) {

		TreeNodeNext root = new TreeNodeNext(1);
		root.left = new TreeNodeNext(2);
		root.right = new TreeNodeNext(3);

		root.left.left = new TreeNodeNext(4);
		root.left.right = new TreeNodeNext(5);

		root.right.left = new TreeNodeNext(6);
		root.right.right = new TreeNodeNext(7);

		display(root, 0);
		
		populateRight(root);

	}

}
