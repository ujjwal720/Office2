package PracticePrograms;

import java.util.ArrayList;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String a="I am a good boy";
		char[] b=a.toCharArray();
		ArrayList<Character> m=new ArrayList<Character>();
		for(int i=0;i<=b.length-1;i++) {
		 if(b[i]!=' ') {
			 m.add(b[i]);
		 }
		 }
		for(int j=m.size()-1;j>=0;j--) {
			if(b[count]!=' ') {
				System.out.print(m.get(j));
			}
			if(b[count]==' ') {
				System.out.print(' ');
				j++;
			}
			count++;
		}
		
		
		
		

	}

}
