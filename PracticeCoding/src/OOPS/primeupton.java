package OOPS;

public class primeupton {

	public static void main(String[] args) {
		
		int n = 300;
        System.out.println(1);
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && j != i) {
					count++;
					break;
				}
			}
			if (count > 0) {

			} else {
				System.out.println(i);
			}

		}

	}

}
