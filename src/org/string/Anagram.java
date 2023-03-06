package org.string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="lisent";
		String s1 = "silent";
		
		if(s.length()==s1.length()) {
			char[] c1 = s.toCharArray();
			char[] c2 = s1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean e = Arrays.equals(c1, c2);
			
			if(e==true) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Length not matched");
		}
	}

}
