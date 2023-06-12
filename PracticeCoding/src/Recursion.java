
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Recursion.rs1(5);
		System.out.println(x);
	}
	
	
	static public int rs1(int n) {
		
	if(n==0) {
		return 1;
	}
	int ans =n*rs1(n-1);
	return ans;

}
}

