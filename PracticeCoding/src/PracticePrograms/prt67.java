package PracticePrograms;

import java.util.Stack;

public class prt67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * the following is by suing stack
		 * Reverse a string using stack
		 * This program is by using stack data structure
		 *   when we pop it will remove the last element
		 */

		Stack<Character> l = new Stack<Character>();
		l.push('a');
		l.push('b');
		l.push('c');
		l.push('d');

		String op = "";

		while (!l.isEmpty()) {
			
			op=op+l.pop();

		}
		
		System.out.println(op);

	}

}
