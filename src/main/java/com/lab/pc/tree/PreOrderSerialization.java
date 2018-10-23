package com.lab.pc.tree;

import java.util.Stack;

public class PreOrderSerialization {

	public static void main(String[] args) {

		String pre = "9,3,4,#,#,1,#,#,2,#,6,#,#";

		boolean flag = isValidSerialization(pre);

		System.out.println(flag);
	}

	private static boolean isValidSerialization(String pre) {

		if (pre == null || pre.length() == 0)
			return false;

		String[] strArray = pre.split(",");

		Stack<String> st = new Stack<>();

		for (int i = 0; i < strArray.length; i++) {

			String cur = strArray[i];

			while (cur.equals("#") && st.size() > 1 && st.peek().equals("#")) {
				st.pop();
				st.pop();
			}
			st.push(cur);
		}

		if (st.size() == 1 && st.peek().equals("#"))
			return true;

		return false;
	}

}
