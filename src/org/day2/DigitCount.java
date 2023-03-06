package org.day2;

public class DigitCount {
	public static void main(String[] args) {
		int num =123456789;
		int rem =0;
		int count = 0;
		
		while(num>0) {
			count++;
			rem=num%10;
			num=num/10;
		}
		System.out.println(count);
		
	}

}
