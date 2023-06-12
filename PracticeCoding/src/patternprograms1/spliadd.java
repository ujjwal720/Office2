package patternprograms1;

public class spliadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add a=new add();
		a.addition(1,10);
		

	}

}

class add {
  int sum=0;
	public void addition(int a, int b) {

		for (int i = a; i <= b; i++) {
            
			int c = i;
			String d = Integer.toString(c);
			char[] e=d.toCharArray();
			for(int j=0;j<=e.length-1;j++) {
			 int k= Character.getNumericValue(e[j]);
			 sum=sum+k;
			}
			
			
			
			
			

		}
		
		System.out.println(sum);

	}
	

}