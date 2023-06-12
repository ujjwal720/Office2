package PracticePrograms;

import java.awt.List;
import java.util.ArrayList;

public class md {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "aaabbbccc";
		String[] b = a.split("");
		int k = 1;
		ArrayList<String> h = new ArrayList<String>();

		for (int i = 0; i <= b.length - 1 - k; i++) {

			h.add(b[i]);
		}

		for (int i = 0; i <= h.size() - 1; i++) {
			if(h.get(i)!="vc") {
			int count = 1;
			for (int j = i+1; j <= h.size() - 1; j++) {
                 
				if(h.get(i).contains(h.get(j))) {
					count++;
					
					h.set(j, "vc");
			  
					
				}
				
				
				
				
			}
			
			System.out.println(count);
			

		}
		}

	}

}
