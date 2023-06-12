package patternprograms1;

public class Palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a=22;
		String g=Integer.toString(a);
		StringBuilder t=new StringBuilder(g);
		
		if(g.equalsIgnoreCase(t.reverse().toString())) {
			System.out.println("The number is palindrome");
		}
		
		else {
			System.out.println("The number is not palindrome");
		}
	}
}
