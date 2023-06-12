package PracticePrograms;

public class SmallestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 68;
		int b = 1;
		for (int i = 1; i <= b * 100; i++) {
			int c = a * i;
			String d = Integer.toString(c);
			if (d.length() == b) {
				System.out.println(c);
				break;
			}

		}

	}

}
