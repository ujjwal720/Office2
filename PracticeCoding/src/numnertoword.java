
public class numnertoword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "16785";

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] b = new String[] { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String[] j = s.split("");

		for (int i = 0; i <= j.length - 1; i++) {
			int c = Integer.parseInt(j[i]);
			for (int k = 0; k <= a.length - 1; k++) {
				if (c == a[k]) {
					System.out.print(b[k] + " ");
					break;
				}

			}
		}

	}

}
