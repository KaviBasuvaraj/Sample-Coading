package org.pyramid;

public class StringPyramid {
	public static void main(String[] args) {
		String s ="INDIA";
		String res = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			res = res+c;
			
			System.out.println(res);
		}
		
	}

}
