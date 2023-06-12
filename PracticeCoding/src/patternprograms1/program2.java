package patternprograms1;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Even odd sum
		
		
		int[] a= {11,12,13,14,15,16};
		int b;
		int c;
		int sum=0;
		int sum1=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		
		b=sum;
		System.out.println(b);

	}

}
