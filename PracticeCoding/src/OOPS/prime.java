package OOPS;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int a = 59;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && i != a) {
				System.out.println("The number is prime");
				count++;
				break;
			}

		}

		if (count > 0) {
			System.out.println("The number is  not prime");
		} else {
			System.out.println("The number is  prime");
		}

	}

}
