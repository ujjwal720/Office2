package PracticePrograms;

import java.util.ArrayList;

public class pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= {1,2,3,1,1,3};
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				
				if(i<j && a[i]==a[j]) {
					System.out.println(""+ i + "," + ""+j);
					
				}
				
			}
			
			
		}

	}

}
