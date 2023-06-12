package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class programs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello world";
		/*
		 * Swap every word first and last character
		 */

		String[] arr = s.split(" ");
		String h = "";
		List<String> o = new ArrayList<String>();
		for (int i = 0; i <= arr.length - 1; i++) {
			
			
			o.add(arr[i]);
			
		}

			String res = o.get(i);

			String arr1[] = res.split("");

			List<String> l = new ArrayList<String>();

			for (int j = 0; j <= arr1.length - 1; j++) {

				l.add(arr1[i]);

			}

			String first = l.get(0);
			String last = l.get(l.size() - 1);

			l.set(0, last);
			l.set(l.size() - 1, first);

			for (int k = 0; k <= l.size() - 1; k++) {

				s = s + l.get(k);

			}

		}

		System.out.println(s);

	}

}
