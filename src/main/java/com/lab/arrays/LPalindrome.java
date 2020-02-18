package com.lab.arrays;

import java.util.TreeMap;

public class LPalindrome {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("ccc"));
	}
	
	public static String longestPalindrome(String s) {
	    
        TreeMap<Integer,String> map = null;
            map = new TreeMap<>();
        
        int len = s.length();
        
        for(int i =0;i<len;i++){
            
            char ch = s.charAt(i);
            int index = s.indexOf(ch,i+1);
            
            if(index != -1){
                if(checkPalidrome(i,index,s)){
                	  String temp = s.substring(i,index+1);
                	  
                        map.put(temp.length(),temp);        
                }
            }
        }
        
        if(len == 1)
          map.put(len, s);
        
        return map.size() > 0 ? map.get(map.lastKey()):null;
    }
    
    private static boolean checkPalidrome(int start,int end,String s){
        
        while(start<end){
            
            if(s.charAt(start) != s.charAt(end))
                return false;
            
            start++;
            end--;
        }
        
        return true;
    }

}
