package com.lab.strings;

public class RverseWordsinSentence {

	public static void main(String[] args) {

		String str = "hello bala";

		char[] strchar = str.toCharArray();

		reverse(strchar, 0, strchar.length - 1);

		System.out.println(str);

		int start = 0;
		
		for (int i = 0; i < strchar.length-1; i++) {

			if (strchar[i] == ' '){
				reverse(strchar, start, i - 1);
				start = i + 1;
			}
		}

		reverse(strchar, start, strchar.length- 1);
		
		System.out.println(String.valueOf(strchar));
	}

	private static void reverse(char[] str, int start, int end) {

		while (start < end) {

			char ch = str[start];
			str[start] = str[end];
			str[end] = ch;

			start++;
			end--;

		}

	}

}
