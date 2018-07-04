package com.lab.arrays;

public class RorateArray {
	private static int MATRIX_SIZE = 4;
	private static int[][] m = new int[MATRIX_SIZE][MATRIX_SIZE];

	private static int last = MATRIX_SIZE-1;
	private static int level = 0;
	private static int totNoOfLevels = MATRIX_SIZE/2;
	
	public static void main(String[] args) {

		int cnt = 0;

		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				m[i][j] = cnt++;
			}

		}
		
		System.out.println("Original\n");
		
		printMatrix();

		System.out.println("----------");
		
		rotateMatrix();
		
		System.out.println("Rotate\n");
		
		printMatrix();

		System.out.println("----------");
		
	}

	private static void printMatrix() {

		for (int i = 0; i < MATRIX_SIZE; i++) {
			for (int j = 0; j < MATRIX_SIZE; j++) {
				if(m[i][j] < 10)
				System.out.print(m[i][j] + "   ");
				else if(m[i][j] < 100)
					System.out.print(m[i][j] + "  ");
				else
					System.out.print(m[i][j] + " ");
			}
			System.out.println("\n");
		}

	}
	
	private static  void rotateMatrix(){
		
		while(level < totNoOfLevels){
		
			for(int i=level;i<last;i++){
				
				swap(level,i,i,last);
				swap(level,i,last,last-i+level);
				swap(level,i,last-i+level,level);
				
			}
			
			++level;
			--last;
		}
	}
	
	
	private static void swap(int i ,int j,int k,int l){
		int temp = m[i][j];
		m[i][j] = m[k][l];
		m[k][l] = temp;
	}

}
