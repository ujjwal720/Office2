
public class nbyrecursion {
	static int ans = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
          long z=Solution23.seriesSum(5);
          System.out.println(z);
	}

	public static void sums(int s) {
		if (s > 10) {
			System.out.println(ans);
			return;
		}
		ans = ans + s;
		sums(s+1);
		

	}

}

class Solution23 {
    // function to return sum of  1, 2, ... n
   static long  seriesSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
        
    }
}
