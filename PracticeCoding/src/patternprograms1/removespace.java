package patternprograms1;

import java.util.ArrayList;
import java.util.List;

public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Ujjwal           Shrivastava";
		String l = "";
		System.out.println(a);

		List<Character> m = new ArrayList<>();

		for (int i = 0; i <= a.length() - 1; i++) {
			if (a.charAt(i) == ' ') {

			} else {
				m.add(a.charAt(i));
			}
		}

		for (int j = 0; j <= m.size() - 1; j++) {
			String d = m.get(j).toString();
			l = l + d;

		}
		a = l;
		System.out.println(a);

	}

}
