package org.sort;

public class SortWithoutRemoveDuplicate {
	
	public static void main(String[] args) {
		int a[] = {1,10,20,10,30,12,20,30,12,1,2,3,2,4};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		
		for (int i : a) {
			System.out.println(i);
			
		}
	}

}
