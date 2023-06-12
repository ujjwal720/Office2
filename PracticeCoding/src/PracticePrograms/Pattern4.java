package PracticePrograms;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int n=0;
		for (int i = 1; i <= 3; i++) {
			count++;
			for (int j = count; j <= 3; j++) {
            
				for(int k=count;k<=count;k++) {
					if(k==count) {
						n++;
						System.out.print(n);
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			

		}

	}

}
