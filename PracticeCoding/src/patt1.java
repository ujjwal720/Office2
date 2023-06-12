
public class patt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=4;
		for(int i=1;i<=6;i++) {
			if(i>3) {
				n--;
			}
			for(int j=1;j<=3;j++) {
			if(i<=3&&(j>=1 && j<=i)||i>3&&(j>=1 && j<=n)) {
				System.out.print("*");
			}	
			else {
				System.out.print("");
			}
					
				
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
