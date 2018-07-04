package com.lab.arrays;

public class MatrixZero {

	
	public static void main(String[] args) {
		
		int[][] matrix = new int[][]{{1,2,3},{4,0,6},{7,8,9}};
		
		print(matrix);
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				if(matrix[i][j] ==0)
					populate(matrix,i,j);
			}
		}
		
		System.out.println("----");
		print(matrix);
	}
	
	
	

	private static void populate(int[][] matrix, int i, int j) {

		for(int k=0;k<matrix.length;k++){
			matrix[i][k] =0;
			matrix[k][j]=0;
		}
		
	}




	private static void print(int[][] m){
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				
				System.out.print(m[i][j]+" ");
			}
			
			System.out.println("\n");
		}
	}
	
	
}
