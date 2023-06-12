package PracticePrograms;

public class prt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if it is not  we are using the coinfg question in respect to boolean
		 * for the coding questions
		 * 
		 * 
		 */
		
		prt6.squreelplay(100, true);

	}

	public static void squreelplay(int temp, boolean issummer) {

		if (issummer == false) {

			if (temp >= 60 && temp <= 90) {

				System.out.println("Squireel can play");

			}

			else {

				System.out.println("Squireel cannot play");

			}

		}

		else {
			
			if (temp >= 60 && temp <= 100) {

				System.out.println("Squireel can play");

			}

			else {

				System.out.println("Squireel cannot play");

			}

		}

	}

}
