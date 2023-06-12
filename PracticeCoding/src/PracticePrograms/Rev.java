package PracticePrograms;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="1Rivet is great company";
		String[] b=a.split(" ");
		for(int i=0;i<=b.length-1;i++) {
			StringBuilder g=new StringBuilder(b[i]);
			System.out.print(g.reverse()+" ");
		}
		
		

	}

}
