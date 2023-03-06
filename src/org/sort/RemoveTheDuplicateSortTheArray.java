package org.sort;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveTheDuplicateSortTheArray {
	
	public static void main(String[] args) {
		int a[] = {10,20,40,20,60,1,20,13,7};
		Set<Integer> s = new TreeSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int b = a[i];
			s.add(b);
			
		}
		
		for (Integer integer : s) {
			System.out.println(integer);
			
		}
	}

}
