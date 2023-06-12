package patternprograms1;

public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d = "Mohan";
		String f = "anhoM";
		int r = d.length();
		int count = 0;
		if(d.length()==f.length()) {
		for (int i = 0; i <= f.length()-1; i++) {

			if (f.contains(Character.toString(d.charAt(i)))) {
				count++;
			} else {
				break;
			}

		}

		if (r == count) {
			System.out.println("The following words are equal");
		}
		else {
			System.out.println("The following string is not equal");
		}
		}
		
		else {
			System.out.println("The length is not same so no need");
		}
	

	}

}
