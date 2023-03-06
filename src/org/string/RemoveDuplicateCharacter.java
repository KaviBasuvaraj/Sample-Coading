package org.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String s = "kavi Basuvaraj";
		Set<Character> s1 = new LinkedHashSet<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {

			char c = s.charAt(i);
			s1.add(c);

		}
		
		for (Character c1 : s1) {
			
			System.out.print(c1);
			
		}
	}

}
