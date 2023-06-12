package PracticePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class vowelsinreverseornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * vowels are in order of aeiou
		 */

		String s = "oabei";
		String result = "";
		String result1 = "";
		List<Character> k = new ArrayList<Character>();
		List<Character> i_m = new ArrayList<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				k.add(s.charAt(i));

			}

		}
		Collections.sort(k);

		for (int j = 0; j <= k.size() - 1; j++) {

			result = result + k.get(j);

		}

		for (int y = 0; y <= s.length() - 1; y++) {

			if (s.charAt(y) == 'a' || s.charAt(y) == 'e' || s.charAt(y) == 'i' || s.charAt(y) == 'o'
					|| s.charAt(y) == 'u') {

				i_m.add(s.charAt(y));

			}

		}
		for (int m = 0; m <= i_m.size() - 1; m++) {

			result1 = result1 + i_m.get(m);

		}

		if (result1.equals(result)) {

			System.out.println("The vowels are in order");

		} else {
			
			System.out.println("The vowels are not in order");

		}

	}

}
