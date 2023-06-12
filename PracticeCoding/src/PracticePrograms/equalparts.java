package PracticePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class equalparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     ArrayList<String> b=new ArrayList<String>();
		     b.add("ab");
		     b.add("cd");
		     b.add("bc");
		     Collections.sort(b);
		     System.out.println(b);
		     Object[] v=b.toArray();
		     System.out.println(v[1]);
		     
		  
		     

	}

}
