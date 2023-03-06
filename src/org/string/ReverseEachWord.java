package org.string;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "Selenium with Java";
		String[] s1 = s.split(" ");
		String res = "";

		for (int i = 0; i < s1.length; i++) {

			String s2 = s1[i];
			String rev = "";

			for (int j = s2.length() - 1; j >= 0; j--) {
				rev = rev + s2.charAt(j);

			}

			res = res + rev + " ";

		}

		System.out.println(res);
	}

}
