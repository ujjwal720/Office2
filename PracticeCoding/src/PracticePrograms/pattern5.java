package PracticePrograms;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1;
		int n = 4;
		for (int i = 1; i <= 5; i++) {
			int p = 1 + n;
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(p);
					p++;

				} else {
					System.out.print(m);
					m++;
				}
			}
			n--;
			System.out.println();
			m = 1;
		}

	}

}
