package PracticePrograms;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a
		// a a a
		// a a a a a
		int n = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j >= 1 && j <= i + n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			n++;
			System.out.println();
		}

	}

}
