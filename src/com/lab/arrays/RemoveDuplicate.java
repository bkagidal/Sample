package com.lab.arrays;

import java.util.Objects;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
		System.out.println(removeDups("aaaacdeea"));

	}

	public static String removeDups(String word){
		
		Objects.requireNonNull(word);
		char[] wordArray = word.toCharArray();

	    int len = wordArray.length;
	    for (int i = 0; i < len; i++) {
	       
	    	 if(wordArray[i]==0)
		        	continue;
		       
	    	int count = 0;
	       // System.out.println(i+" "+wordArray[i]);
	       
	        for (int j = i; j < len; j++) {
	            if (wordArray[i] == wordArray[j]) {
	                count++;
	                if (count > 1) {
	                    wordArray[j] = 0;
	                }
	            }
	        }
	    }
	    return String.valueOf(wordArray);
		
	}
}
