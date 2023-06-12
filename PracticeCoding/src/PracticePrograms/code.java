package PracticePrograms;

public class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String f="";
		int[] a= {1,2,3,4,35,36};
		for(int j=0;j<=a.length-1;j++) {
			 
		String s=Integer.toString(a[j]);
		
		for(int k=0;k<=s.length()-1;k++) {
		    f=f+s.charAt(k);
		}
		s="";
		
		
			
		}
		System.out.println(f);

	}

}
