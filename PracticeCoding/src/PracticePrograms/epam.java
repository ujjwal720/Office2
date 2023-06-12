package PracticePrograms;

import java.util.ArrayList;

public class epam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m = new ArrayList<Integer>();
		String s = "wwwggoppp";

		char[] b = s.toCharArray();

		for (int i = 0; i <= b.length - 1; i++) {

			int count = 1;
			if (b[i] != '?') {

				for (int j = i + 1; j <= b.length - 1; j++) {
					if (b[i] == b[j]) {
						b[j] = '?';
						count++;
					}

					else {

						System.out.print(b[i]);
						break;

					}

				}
				m.add(count);
			}

		}
		
		

	}

}
