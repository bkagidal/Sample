package com.lab.strings;

public class ConvertBase {


	public static void main(String[] args) {

		System.out.println(convertBase("615", 7, 13));
	}

	public static String convertBase(String numAsString, int bl, int b2) {
		boolean isNegative = numAsString.startsWith("-");
		int numAsInt = 0;

		for (int i = (isNegative ? 1 : 0); i < numAsString.length(); ++i) {
			numAsInt *= bl;
			numAsInt += Character.isDigit(numAsString.charAt(i)) ? numAsString.charAt(i) - '0'
					: numAsString.charAt(i) - 'A' + 10;
		}
		
		System.out.println(numAsInt);
		return (isNegative ? "-" : "") + (numAsInt == 0 ? "0" : constructFromBase1(numAsInt, b2));
	}

	private static String constructFromBase(int numAsInt, int base) {
		return numAsInt == 0 ? ""
				: constructFromBase(numAsInt / base, base)
						+ (char) (numAsInt % base >= 10 ? 'A' + numAsInt % base - 10 : '0' + numAsInt % base);
	}

	private static String constructFromBase1(int numAsInt, int base) {

		if (numAsInt == 0)
			return "";
		else {

			String recurse = constructFromBase1(numAsInt / base, base);

			String result = recurse
					+ (char) (numAsInt % base >= 10 ? 'A' + numAsInt % base - 10 : '0' + numAsInt % base);

			return result.trim();

		}
	}

}
