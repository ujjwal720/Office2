package PracticePrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "mtmntttn";
		StringBuilder string = new StringBuilder(s);
       
		String f = "y";
		List<Character> m = new ArrayList<Character>();
		List<Integer> n = new ArrayList<Integer>();

		for (int i = 0; i <= string.length() - 1; i++) {
			if (string.charAt(i) != '?') {
				int count = 1;
				m.add(string.charAt(i));

				for (int j = i + 1; j <= string.length() - 1; j++) {

					if (string.charAt(i) == string.charAt(j)) {
						 string.setCharAt(j, '?');
						count++;
					}

				}
				n.add(count);

			}
		}
		
		
		Integer h=Collections.max(n);
        Integer k=n.indexOf(h);
        System.out.println(k);
        System.out.println("The max time letter is"+" "+ m.get(k));
		
		
	}

}
