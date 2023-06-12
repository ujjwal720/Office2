package PracticePrograms;

public class program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "00986543210";
		/*
		 * Remove the leading zeros of the following strings
		 */
		int start = 0;
		String resultant = "";
		char[] l = s.toCharArray();
		for (int i = 0; i <= s.length() - 1; i++) {

			String s_m = Character.toString(s.charAt(i));

			int x = Integer.parseInt(s_m);

			if (!s_m.equals("0")) {

				start = i;
				break;

			}

		}

		for (int j = start; j <= l.length - 1; j++) {
			resultant = resultant + l[j];

		}
		
		System.out.println(resultant);

	}

}
