package PracticePrograms;

public class timing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrival = 0;
		int delayed = 2;
		int count = 1;
		int l = 1;
		int count2 = 0;
		int time = -1;

		while (l <= delayed) {

			if (arrival < 23) {

				arrival = arrival + 1;

			}

			else {

				time = count2;

				count2++;

			}
			l++;
			

		}
		if (time != -1) {

			System.out.println(time+":"+"00"+"PM");
		}

		else {
			
			System.out.println(arrival+":"+"00"+"AM");

		}

	}

}
