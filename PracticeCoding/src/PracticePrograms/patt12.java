package PracticePrograms;

public class patt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i = 1; i <= 5; i++) {
			n=i;
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					
                  System.out.print(n);
                  n++;
                  
                 }
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
