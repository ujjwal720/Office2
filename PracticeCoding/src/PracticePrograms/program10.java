package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello world india is my country whre jtghkjhgj sgkkjhf jflgkkjd jfgjfhkgfh jgfjfgkkhfg jfghkgfhjgf hkfhkgfkkfg hkgfhkgfhkg";
		List<String> poi = new ArrayList<String>();
		String[] arr = s.split(" ");
		String h = "";

		List<String> result = new ArrayList<String>();

		for (int i = 0; i <= arr.length - 1; i++) {

			result.add(arr[i]);

		}

		for (int j = 0; j <= result.size() - 1; j++) {

			String words = result.get(j);
			String[] words1 = words.split("");
			List<String> result1 = new ArrayList<String>();

			for (int k = 0; k <= words1.length - 1; k++) {

				result1.add(words1[k]);

			}

			String first = result1.get(0);
			String last = result1.get(result1.size() - 1);

			result1.set(0, last);
			result1.set(result1.size() - 1, first);

			for (int l = 0; l <= result1.size() - 1; l++) {

				h = h + result1.get(l);

			}

			poi.add(h);
			h = "";

		}

		for (int o = 0; o <= poi.size() - 1; o++) {

			System.out.print(poi.get(o) + " ");

		}

	}

}
