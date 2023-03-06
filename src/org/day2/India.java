package org.day2;

public class India {
	
	public static void main(String[] args) {
		
		String s1 ="Chennai";
		String s2 = "Bangalore";
		
		System.out.println("Before s1 : "+s1);
		System.out.println("Before s2 : "+s2);
		
		s1 = s1+s2;
		s2=s1.substring(0	, s1.length()-s2.length());
		s1=s1.substring(s2.length());		
		
		System.out.println("\nAfter s1 : "+s1);
		System.out.println("After s2 : "+s2);
	}

}
