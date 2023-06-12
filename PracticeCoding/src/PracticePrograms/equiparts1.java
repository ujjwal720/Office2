package PracticePrograms;

public class equiparts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdghil";
		int length = s.length() / 2;
		/*
		 * Have to divide only in two parts
		 */
		int count = 0;
		String roi = "";
		for (int i = 1; i <= length; i++) {

			for (int j = 1; j <= 2; j++) {

				roi = roi + s.charAt(count);
				count++;

			}

			System.out.println(roi);
			roi = "";

		}

	}

}
