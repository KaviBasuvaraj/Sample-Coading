package org.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class No1 {
	public static boolean isPalindrome(int x) {
//negative numbers are not palindrome
		if (x < 0)
			return false;
// initialize how many zeros
		int div = 1;
		while (x / div >= 10) {
			div *= 10;
		}
		while (x != 0) {
			int left = x / div;
			int right = x % 10;
			if (left != right)
				return false;
			x = (x % div) / 10;
			div /= 100;
		}
		return true;
	}
}