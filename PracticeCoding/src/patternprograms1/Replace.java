package patternprograms1;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1225535125;
		String b = Integer.toString(a);
		char[] c=b.toCharArray();
		String d="";
		for(int i=0;i<=c.length-1;i++) {
			if(c[i]=='5') {
				c[i]='0';
				d=d+c[i];
			}
			else {
				d=d+c[i];
			}
		}
		
		
		for(char r:c) {
			System.out.print(r);
		}
		

	}

}
