package org.day2;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int a=153;
		int n=a;
		int rem =0;
		int res =0;
		
		while(a>0) {
			rem =a%10;
			res = res + (rem*rem*rem);
			a = a/10;
			
		}
		
		if(n==res) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}

}
