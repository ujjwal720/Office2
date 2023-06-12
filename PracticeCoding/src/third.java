
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="bmmk";
		String b="";
		String c="";
	    char[] d= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<=a.length()/2-1;i++) {
		b=b+a.charAt(i);
		}
		for(int j=a.length()/2-1+1;j<=a.length()-1;j++) {
			c=c+a.charAt(j);
		}
		
		char[] f=b.toCharArray();
		char[] g=c.toCharArray();
		
		for(int m=0;m<=b.length()-1;m++) {
			
			for(int k=0;k<=d.length-1;k++) {
			if(f[m]==d[k]) {
				count++;
				break;
			}
			}
		}
			
			for(int p=0;p<=b.length()-1;p++) {
				
				for(int u=0;u<=d.length-1;u++) {
				if(f[p]==d[u]) {
					count++;
					break;
				}
				}
			
			
		}
		
		if(count==2) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}

}
}
