package com.lab.arrays;

public class ReverseCStyle {

	public static void main(String[] args) {
		reverse("cat n");

	}
	
	private static void reverse(String str){
		
		int start=0;
		int end = str.length()-1;
		
		while(end>=start){
			System.out.print(str.charAt(end--));
		}
		
	}

}
