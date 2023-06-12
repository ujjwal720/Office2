package PracticePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rewq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Substring of characters
		 * print all substring of the abcd
		 * second most popular and lease popular
		 */
		/*
		 * t
		 */
		Integer[] l= {1,2,3,8,17,9};
		List<Integer> i_o=Arrays.asList(l);
	    Collections.sort(i_o);
	    System.out.println("The second most larget element is"+ " "+i_o.get(i_o.size()-1));
	    System.out.println("The second most smallest element is"+ " "+i_o.get(0+1));

	}

}
