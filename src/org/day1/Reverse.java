package org.day1;

public class Reverse {
	public static void main(String[] args) {
		
		int num = 1234567890, rem=0, rev=0;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		
		if(num!=rev) {
			System.out.println("Reversed number : " +rev);
		}
		else {
			System.out.println("Not reversed");
		}
		
	}

}
