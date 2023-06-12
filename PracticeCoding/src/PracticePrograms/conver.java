package PracticePrograms;

public class conver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Milton";
		String l = "";
		for (int i = 0; i <= s.length() - 1; i++) {

			if (Character.isUpperCase(s.charAt(i))) {

				char t = Character.toLowerCase(s.charAt(i));

				l = l + t;

			}

			else {
				
				char t = Character.toUpperCase(s.charAt(i));
				l=l+t;

			}

		}
		
		System.out.println(l);

	}

}
