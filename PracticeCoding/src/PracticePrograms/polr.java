package PracticePrograms;

public class polr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String coding questions
		 */

		/*
		 * String contains digit or not
		 */

		String s = "cds1231";
		char[] result1 = s.toCharArray();
		int count = 0;
		for (int i = 0; i <= result1.length - 1; i++) {

			if (Character.isDigit(result1[i])) {

				count++;
				break;

			}

		}
		if (count != 0) {

			System.out.println("The string contains the digit");

		} else {
			
			System.out.println("The string do not contain any digit");
			
			

		}

	}

}
