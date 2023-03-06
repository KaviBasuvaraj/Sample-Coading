package org.pyramid;

public class RightPyramid {
	public static void main(String[] args) {
		int row =5;
		
		for (int i = 1; i <=row; i++) {
			for (int j =row-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <i ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
