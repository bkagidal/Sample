package com.lab.stacks;

public class Reverse {

	public static void main(String[] args) {
		
		String s = "ha";
		
		System.out.println(reverse(s));
		

	}
	
	public static String reverse(String s){
		
		char[] chrStr = s.toCharArray();
		int start=0,end = s.length()-1;
		
		while(start<end){
			char temp = chrStr[start];
			chrStr[start]=chrStr[end];
			chrStr[end] =temp;
			start++;
			end--;
		}
		
		
		return String.valueOf(chrStr);
	}

}
