package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class qualparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabcerfh";
	
		
		List<String> m = new ArrayList<String>();
		String result = "";
		for (int i = 0; i <= s.length() - 2; i += 2) {
		    result = "" + s.charAt(i) + s.charAt(i+1);
		    m.add(result);
		}
		if (s.length() % 2 == 1) {
		    m.add("" + s.charAt(s.length() - 1));
		}
		System.out.println(m);

	}

}
