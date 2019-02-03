package com.lab.gg.arrays;

public class ArrayRotation {
	
	private static void rotateArrayLeft(int[] array,int d,int n){
		
		int temp;
		
		int j=0;
		for(int i=0;i<d;i++){
			temp = array[0];
			
			for(j=0;j<n-1;j++)
				array[j] = array[j+1];
			
			array[j] = temp;
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] a ={1,2,3,4,5,6,7};
		
		rotateArrayLeft(a, 3, a.length);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] +" ");

	}

}
