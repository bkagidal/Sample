package com.lab.strings;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalidrome("A man, a plan, a canal, Panama."));
	}

	private static boolean isPalidrome(String str) {
		System.out.println(str);

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {

			while (!Character.isLetterOrDigit(str.charAt(start)) && start < end) {
				++start;
			}
			
			while (!Character.isLetterOrDigit(str.charAt(end)) && start < end) {
				--end;
			}

			if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end)))
				return false;

			start++;
			end--;
		}

		return true;

	}

}
