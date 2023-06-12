package PracticePrograms;

public class program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Closet number
		 */

		int x = 15;
		int divide = 6;
		int n = 0;
		int value1 = 0;
		int value2 = 0;
		while (true) {

			n++;
			int start = x - n;
			int end = n + x;

			if (start % divide == 0 || end % divide == 0) {

				if (start % divide == 0) {
					value1 = start;

				}
				if (end % divide == 0) {
					value2 = end;

				}

				break;

			}

		}

		System.out.println(value1);
		System.out.println(value2);

	}

}
