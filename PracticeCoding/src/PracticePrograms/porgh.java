package PracticePrograms;

public class porgh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="I like this program very much";
		String[] b=a.split(" ");
		
		for(int i=0;i<=b.length-1;i++) {
			StringBuilder c=new StringBuilder(b[i]);
			System.out.print(c.reverse()+" ");
			
		}

	}

}
