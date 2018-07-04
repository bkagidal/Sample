package com.lab.arrays;

public class ReplaceSpace {

	public static void main(String[] args) {
		System.out.println(replacespace("Hi Hello"));
		System.out.println(replacespace2("Hi Hello".toCharArray()));
	}

	private static String replacespace(String str) {

		return str.replace(" ", "%20");
	}

	private static String replacespace2(char[] str) {

		int len = 0, newlength = 0, spacecnt = 0;

		len = str.length;

		for (int i = 0; i < len; i++) {

			if (str[i] == ' ')
				spacecnt++;
		}

		newlength = len + spacecnt * 2;
		//str[newlength] = '\0';
		char[] str1 = new char[newlength];
		for (int i = len-1; i >= 0; i--) {

			if (str[i] == ' ') {

				str1[newlength - 1] = '0';
				str1[newlength - 2] = '2';
				str1[newlength - 3] = '%';

				newlength = newlength - 3;
			} else {

				str1[newlength - 1] = str[i];
				newlength = newlength - 1;
			}

		}

		return String.valueOf(str1);
	}
}
