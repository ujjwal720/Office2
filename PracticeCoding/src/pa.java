
public class pa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		for(int i=1;i<=5;i++) {
			n--;
			for(int j=1;j<=5;j++) {
		if(j>=n && j<=5) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
			}
			System.out.println();
		}

	}

}
