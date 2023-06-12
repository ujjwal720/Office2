
public class largestinevenandod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Replace program in java
		 */

		String result = "apples";
		String result2 = "apples";
		char one = 'a';
		char two = 'p';
		char[] a = result.toCharArray();
		char[] b = result2.toCharArray();
		String fr = "";
		for (int i = 0; i <= result.length() - 1; i++) {
			if (a[i] == one) {

				b[i] = two;

			}
			if (a[i] == two) {

				b[i] = one;

			}

		}

		for (int i = 0; i <= b.length - 1; i++) {

			fr = fr + b[i];

		}

		System.out.println(fr);

	}

}
