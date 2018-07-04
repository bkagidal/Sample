package com.lab.stacks;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums ={1,2,3,4,5,6,7} ;
		int k=3;
		
		rotate(nums,k);
		
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
	}
	
	public static void rotate(int[] nums,int k){
		
		if(k > nums.length)
			k = k%nums.length;
		
		int[] results = new int[nums.length];
		
		for(int i=0;i<k;i++)
			results[i] = nums[nums.length-k+i];
		
		int j=0;
		for(int i=k;i<nums.length;i++){
			results[i] = nums[j];
			j++;	
		}
		
		System.arraycopy(results, 0, nums, 0, results.length);
		
	/*	for(int i=0;i<results.length;i++)
			System.out.print(results[i]+" ");
		*/
	}

}
