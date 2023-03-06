package org.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {
	
	public static void main(String[] args) {
		String s = "kavi kavi mahi david mahi david";
		String [] s2 = s.split(" ");
		Set<String> s1 = new LinkedHashSet<String>();
		
		for(String s3: s2) {
			s1.add(s3);
		}
		System.out.print(s1);
	}

}
