
public class type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
				'p','q','r','s','t','u','v','w','x','y','z'};
		String b="	ujjwal";
		char[] c= b.toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
		if(c[i]==a[j]) {
			System.out.print(a[j+1]);
		}		
				
			}
		}
		
		

	}

}
