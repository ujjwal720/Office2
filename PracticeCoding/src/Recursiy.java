
public class Recursiy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursiy.sm(1);
	}

	static void sm(int a) {
		if (a > 10) {
			return;
		}

		System.out.println(a);
		Recursiy.sm(a + 1);
	}

	public static void kl() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
