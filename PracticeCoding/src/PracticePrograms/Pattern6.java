package PracticePrograms;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			count = i;
			for (int j = 1; j <= 5; j++) {
         if(i>=j) {
        	 System.out.print(count);
        	 count--;
         }
         else {
        	 System.out.print(" ");
         }
			}
			System.out.println();
		}

	}

}
