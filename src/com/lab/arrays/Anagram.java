package com.lab.arrays;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(checkAnagram("listen","silent"));
		System.out.println(checkAnagram2("listen","silent"));
	}
	
	
	public static boolean checkAnagram(String str1,String str2){
		
		char[] first = str1.toCharArray();
		char[] second = str2.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		//System.out.println( String.valueOf(first).compareTo(String.valueOf(second)));
		return String.valueOf(first).equals(String.valueOf(second));
	}
	
	
	public static boolean checkAnagram2(String str1,String str2){
		
		if(str1.length() != str2.length())
			return false;
		
		char[] char_set1 = str1.toCharArray();
		int[] charset1 = new int[256];
		
		for(int i=0;i<char_set1.length;i++){
			charset1[char_set1[i]]++;
		}
			
		char[] char_set2 = str2.toCharArray();
		int[] charset2 = new int[256];
		
		for(int j=0;j<char_set2.length;j++){
			charset2[char_set2[j]]++;
		}
		
		for(int i=0;i<256;i++){
			if(charset1[i] != charset2[i])
				return false;
		}
		
		return true;
	}

}
