package com.lab.strings;

public class IntToString {

	public static void main(String[] args) {
		System.out.println(intToStr(456));
		System.out.println(intoString1(456));
		
	}
	
	private static String intToStr(int num){
		
		return (num == 0) ? "": intToStr(num/10) + num%10;
		
	}
	
	private static String intoString1(int num){
		
		boolean isnegative = false;
		
		if(num<0) isnegative = true;
		
		StringBuilder sb =new StringBuilder();
		do{
			sb.append(Math.abs(num%10));
			num = num/10;
		}while(num>0);
		
		
			if(isnegative)
				sb.append("-");
		return sb.reverse().toString();
			
	}

}
