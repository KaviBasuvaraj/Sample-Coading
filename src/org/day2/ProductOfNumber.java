package org.day2;

public class ProductOfNumber {
	public static void main(String[] args) {
		int num = 12345;
		int rem=0;
		int res=1;
		
		while(num>0) {
			rem =num%10;
			res = res * rem;
			num = num/10;
		}
		System.out.println(res);
	}

}
