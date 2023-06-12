package PracticePrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class proyui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Consistent strings which contain character like l in the array
		 */

		String[] actual = { "ad", "bd", "aaab", "baa", "badab", "aaa" };

		String l = "abc";

		char[] x_c = l.toCharArray();

		for (int i = 0; i <= actual.length - 1; i++) {

			String a_x = actual[i];

			List<Character> p = new ArrayList<Character>();

			for (int j = 0; j <= a_x.length() - 1; j++) {

				p.add(a_x.charAt(j));

			}

			Set<Character> h_S = new HashSet<Character>(p);

			int count = 0;

			List<Character> p_s = new ArrayList<Character>(h_S);

			for (int s = 0; s <= x_c.length - 1; s++) {

				for (int y = 0; y <= p_s.size() - 1; y++) {

					if (x_c[s] == p_s.get(y)) {

						count++;

					}

				}

			}

			if (count == p_s.size()) {

				System.out.println(a_x);

			}

		}

	}

}
