package patternprograms1;

public class prepinsta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="###***";
		int count1=0;
		int count2=0;
		for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)=='#') {
			count1++;
		}
		else {
			if(s.charAt(i)=='*') {
				count2++;
			}
		}
		}
		
		if(count1==count2) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}

}
