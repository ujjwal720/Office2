package patternprograms1;

public class tre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * script in selenium
		 */

		/*
		 * Number of time string code apperas
		 */
		
		tre.countCode("codescode");

	}

	public static void countCode(String s) {
		
		int count=0;

		s = s.replace("code", "?");

		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) == '?') {
				
				count++;

			}

		}
		
		System.out.println(count);

	}

}
