package PracticePrograms;

public class jarvis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Reverse the word from the prefix of the string
		 */

		String actual_s = "abcdefd";
		char f = 'd';

		int x = 0;
		String o = "";
		for (int i = 0; i <= actual_s.length() - 1; i++) {

			if (actual_s.charAt(i) == f) {

				x = i;
				break;
			}

		}

		for (int j = x; j >= 0; j--) {

			o = o + actual_s.charAt(j);

		}

		for (int k = x + 1; k <= actual_s.length() - 1; k++) {

			o = o + actual_s.charAt(k);

		}

		System.out.println(o);

	}

}
