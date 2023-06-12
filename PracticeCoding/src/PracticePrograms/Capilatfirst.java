package PracticePrograms;

public class Capilatfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "This is the beauty of india";
		String[] b = a.split(" ");
		System.out.println(b.length);
		for (int i = 0; i <= b.length - 1; i++) {
			char[] c = b[i].toCharArray();
			for (int j = 0; j <= c.length - 1; j++) {
				if(j==0) {
					System.out.print(Character.toUpperCase(c[0]));
				}
				else {
					System.out.print(c[j]);
				}
			}
			System.out.print(" ");

		}

	}

}
