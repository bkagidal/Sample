package com.lab.strings;

public class StringToInt {

	public static void main(String[] args) {
		
		System.out.println(toInt("123"));

	}
	
	private static int toInt(String str){
		int result=0;
		
		for(int i=0;i<str.length();i++){
			 int digit = str.charAt(i)-'0';
			 result = result*10 + digit;
		}
		
		return result;
	}

}
