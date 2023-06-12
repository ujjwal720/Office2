package patternprograms1;

public class romantointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Roman to integer

		int[] a = { 1, 5, 10, 50, 100, 500, 1000 };
		String[] b = { "I", "V", "X", "L", "C", "D", "M" };
		String c = "XXI";
		String[] d = c.split("");
		int sum=0;

		for (int i = 0; i <= d.length - 1; i++) {

			for (int j = 0; j <= b.length - 1; j++) {
             if(d[i].equalsIgnoreCase(b[j])) {
            	 sum=sum+a[j];
             }
			}
		}
		System.out.println(sum);

	}

}
