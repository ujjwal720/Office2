package patternprograms1;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 18, 1, 2, 18, 9, 14, 15, 16 };
		int b = 18;
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % b == 0) {
				count++;
			}

		}

		System.out.print(count);
	}

}
