package com.lab.practice;

public class ConvertBasePrac {

	public static void main(String[] args) {
		System.out.println(convertBase("-615", 7, 13));
	}
	
	private static String convertBase(String str,int b1,int b2){
		
		boolean isnegative = false;
		
		if(str.charAt(0) == '-') isnegative =true;
		
		int numInt =0;
		
		for(int i=(isnegative)?1:0; i<str.length();i++){
			
			numInt*=b1;
			numInt+=Character.isDigit(str.charAt(i))?str.charAt(i) -'0':str.charAt(i)-'A' +10;
		}
		
		//System.out.println(numInt);
		return ((isnegative) ? "-":" ") + ((numInt== 0) ? "0":constructFromBase(numInt,b2));
	}

	private static String constructFromBase(int numInt,int base) {
		
		return (numInt == 0)?"":constructFromBase(numInt/base,base) + (char) ((numInt % base >=10) ? 'A' + numInt % base -10:'0' + numInt % base); 
	}

}
