package com.lab.stacks;

public class ReverseWord {

	public static void main(String[] args) {
		
		String mstring = "the sky is blue";
		
		char[] strChar= reverse(mstring.toCharArray(),0,mstring.length()-1);
		
		System.out.println(String.valueOf(strChar));
		int start =0;
		
		for(int i=0;i<strChar.length-1;i++){
			
			if(strChar[i] == ' '){
				strChar = reverse(strChar,start,i-1);
				start = i+1;
			}
			
		}
		
		reverse(strChar,start,strChar.length-1);
		
		
		System.out.println(strChar);
	}
	
	public static char[] reverse(char[] str,int start,int end){
		
		while(start<end){
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		
		return str;
	}
	
	

}
