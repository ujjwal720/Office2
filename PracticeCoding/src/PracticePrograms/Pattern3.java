package PracticePrograms;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			int n = 6;
			for (int j = 1; j <= 5; j++) {
				if (j >= 1 && j <= 5 && n != 0) {
					n--;
					if (n == i) {
						System.out.print("*");

					}

					else {

						System.out.print(n);
					}

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
