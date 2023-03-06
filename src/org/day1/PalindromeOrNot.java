package org.day1;

public class PalindromeOrNot {
	
	public static void main(String[] args) {
		int num =1456541, n = num;
		int rem = 0, rev = 0;
		
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}

		if(n==rev) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
	}

}
