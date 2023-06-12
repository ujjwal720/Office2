package PracticePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class programspract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "flower", "flow", "flopation" };
		int count1 = s.length;
		/*
		 * Find the lowest string
		 */
		String resu = "";
		List<Integer> u = new ArrayList<Integer>();
		List<Integer> um = new ArrayList<Integer>();
		String f_r = "";

		for (int i = 0; i <= s.length - 1; i++) {

			int k = s[i].length();
			u.add(k);

		}

		for (int j = 0; j <= u.size() - 1; j++) {

			um.add(u.get(j));

		}

		Collections.sort(um);

		for (int k = 0; k <= um.size() - 1; k++) {
			if (um.get(0) == u.get(k)) {

				resu = s[k];

			}
		}

		for (int n = 0; n <= resu.length() - 1; n++) {
			int count = 0;

			char r = resu.charAt(n);

			for (int m = 0; m <= s.length - 1; m++) {

				String resultant = s[m];

				for (int u1 = 0; u1 <= resultant.length() - 1; u1++) {

					if (r == resultant.charAt(n) && u1==n)

						count++;

					}

				}
			
			if (count == count1) {

				f_r = f_r + r;

			}

			else {

				break;
			}


			}

			/*
			 * 
			 */
			
		}

	}


