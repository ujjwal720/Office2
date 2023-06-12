package PracticePrograms;

public class proh6712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Replace then minus program as paps is confused between 6 and 9
		 */

		int amount = 56;
		String result = "";
		String result1 = Integer.toString(amount);

		for (int i = 0; i <= result1.length() - 1; i++) {

			if (result1.charAt(i) != '6') {

				result = result + result1.charAt(i);

			}

			if (result1.charAt(i) == '6') {
				result = result + '9';
			}

		}

		System.out.println(result);
		/*
		 * Now suntract
		 */

		int i = Integer.parseInt(result);

		int f_reesult = amount - i;

		System.out.println(Math.abs(f_reesult));

	}

}
