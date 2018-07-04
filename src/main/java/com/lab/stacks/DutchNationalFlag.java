package com.lab.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DutchNationalFlag {
	
	public static enum Color {RED,WHITE,BLUE};
	
	
	private static List<Color> readArray(int n){
		
		Random r = new Random();
		
		List<Color> ret = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			ret.add(Color.values()[r.nextInt(3)]);
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(Color.BLUE.ordinal());
		List<Color> list = readArray(10);
		
		for(Color col:list){
			
			System.out.print(col+" ");
		}
		
	}

}
