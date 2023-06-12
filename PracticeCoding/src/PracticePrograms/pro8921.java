package PracticePrograms;

public class pro8921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fill Spaces with @40 in the java
		 */

		String s = "Hello fuck off this life";
		String[] u = s.split(" ");
		String resultant = "";
		for (int i = 0; i <= u.length - 1; i++) {

			if (i < u.length - 1) {
				resultant = resultant + u[i] + "@40";
			} else {

				resultant = resultant + u[i];
			}

		}

		System.out.println(resultant);

	}

}
