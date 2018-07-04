package com.lab.strings;

public class SSDecodeColID {

	public static void main(String[] args) {

		System.out.println(decode("ZZ"));

	}

	private static int decode(String str) {

		int numInt = 0;

		for (int i = 0; i < str.length(); i++) {

			numInt *= 26;
			numInt += str.charAt(i) - 'A' + 1;
		}

		return numInt;
	}

}
