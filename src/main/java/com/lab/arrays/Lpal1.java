package com.lab.arrays;


public class Lpal1 {

	static String res = "";
	public static void main(String[] args) {
	
		
		
		longestPalindrome("ccc");
		
		System.out.println(res);

	}

	

	public static  String longestPalindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			expandPaliAt(s, i, i); // try keeping this char in middle
			expandPaliAt(s, i, i + 1); // no middle chars
		}
		return res;
	}

	private  static void expandPaliAt(String s, int i, int j) {
		while (i >= 0 && j < s.length() && i <= j && s.charAt(i) == s.charAt(j)) {
			--i;
			++j;
		}
		// current palindrome is s[i+1...j-1]
		if (res.length() < (j - 1 - (i + 1) + 1))
			res = s.substring(i + 1, j);
	}

}
