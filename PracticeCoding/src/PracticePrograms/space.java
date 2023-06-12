package PracticePrograms;

public class space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g = "i am a good boy";
		// String[] m=g.split("");
		char[] d = g.toCharArray();
		int count = -1;
		for (int i = d.length - 1; i >= 0; i--) {
			if(d[i]==' ') {
				count++;
				continue;
			}
		count++;
		
			
			if (d[count] != ' ') {
				

					System.out.print(d[i]);
			
				// System.out.println(m[count]);
			}
			if (d[count] == ' ') {
				System.out.print(" ");
				

					System.out.print(d[i]);
				
			}
			
		}

	}

}
