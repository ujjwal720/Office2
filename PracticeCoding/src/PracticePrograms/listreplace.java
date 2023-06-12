package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class listreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("w");
		
		l.set(0, "q");
		l.set(l.size()-1, "ui");
		
		System.out.println(l);

	}

}
