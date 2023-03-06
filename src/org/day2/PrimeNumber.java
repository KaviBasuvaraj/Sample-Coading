package org.day2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 0;
		List<Integer> l = new ArrayList<>();
		for (int j = 0; j < 100; j++) {
			int num[] = { j };
			for (int in : num) {
				int count = 0;
				if (in > 1) {
					for (int i = 1; i <= in/2; i++) {
						if (in % i == 0) {
							count++;
						}
					}
					if (count == 1) {
						n++;
						l.add(j);
						System.out.println(j);
					} else {
						System.out.println("not a prime");
					}
				} else {
					System.out.println("non prime");
				}
			}
		}
		System.out.println(n);
		System.out.println(l);
	}

}
