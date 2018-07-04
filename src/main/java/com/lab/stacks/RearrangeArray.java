package com.lab.stacks;

import java.util.Arrays;

public class RearrangeArray {
	
	public static void rearrange(int[] array){
		
		int evenIndex=0,oddIndex = array.length-1;
		
		while(evenIndex < oddIndex){
			
			if(array[evenIndex] % 2 ==0)
				evenIndex++;
			else{
				//oddIndex--;
				int temp = array[evenIndex];
				array[evenIndex] = array[--oddIndex];
				array[oddIndex] = temp;
			}
				
		}
	}

	public static void main(String[] args) {
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		rearrange(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
