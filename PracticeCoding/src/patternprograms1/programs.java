package patternprograms1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A7BR13";
		String l = "";
		List<Character> a = new ArrayList<Character>();
		List<Integer> b = new ArrayList<Integer>();
		char[] d = s.toCharArray();

		for (int i = 0; i <= d.length - 1; i++) {
			if (Character.isLetter(d[i])) {
				a.add(d[i]);
			}
		}

		Collections.sort(a);

		for (int j = 0; j <= a.size() - 1; j++) {
			l = l + a.get(j);
		}

		for (int m = 0; m <= d.length - 1; m++) {
			if (Character.isDigit(d[m])) {
				b.add(Integer.parseInt(Character.toString(d[m])));
			}
		}
		Collections.sort(b);

		for (int p = 0; p <= b.size() - 1; p++) {
			l = l + b.get(p);
		}

		System.out.println(l);

	}

}
