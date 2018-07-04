package com.lab.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueChars2 {

	public static void main(String[] args) {
		
		String str="abcdef";
		Set<Character> myset = new HashSet<>();
		
		for(char ch: str.toCharArray()){
			
			if(myset.contains(ch)){
				
				System.out.println("contains duplicate");
				return ;
			}else
				myset.add(ch);
		}
		
		System.out.println("Unique Chars");

	}

}
