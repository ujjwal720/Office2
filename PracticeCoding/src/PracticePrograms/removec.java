package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class removec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "t1trivetsdfsdfsgdsgsgggdsgsdggdgdfgfdgfdgaresrtsnfhndfjmjncggxhhxhcfchgfyhydtfgdxhxfhyxhfh";
		char b = 't';
		StringBuilder c = new StringBuilder(a);
		List<Character> f=new ArrayList<Character>();

		for (int i = 0; i <= c.length() - 1; i++) {
			if (a.charAt(i)!=b) {
				f.add(c.charAt(i));
			}

		}

		String v="";
		
		for(int j=0;j<=f.size()-1;j++) {
			v=v+f.get(j);
		}
		
		System.out.println(v);

	}

}
