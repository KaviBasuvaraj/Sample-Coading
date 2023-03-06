package org.swap;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int a=50;
		int b=10;
		
//		a=a*b;   //50*10 =500
//		b=a/b;   //500/10 = 50
//		a=a/b;   // 500/50 = 10
//		
		
//		b=b*a;
//		a=b/a;
//		b=b/a;
		
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
