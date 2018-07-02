package com.lab.arrays;

public class UniqueChars {

	public static void main(String[] args) {

		if(isUnique("abcdefg"))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
		
	}

	public static boolean isUnique(String str) {

		boolean[] chat_set = new boolean[256];

		for (char ch : str.toCharArray()) {

			if (chat_set[ch])
				return false;

			chat_set[ch] = true;
		}
		return true;
	}

}
