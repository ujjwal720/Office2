package PracticePrograms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] l = new Integer[] {19,4,2,3,8,11,13,15,12,14};
		List<Integer> ui=Arrays.asList(l);
		System.out.println(ui);
		ck d=new ck();
		d.m(ui);
		
		

	}

	public void m(List<Integer> ui) {

		Collections.sort(ui);
		System.out.println(ui.get(ui.size() - 1));

	}

}
