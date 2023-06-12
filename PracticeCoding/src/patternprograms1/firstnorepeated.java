package patternprograms1;

public class firstnorepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstnorepeated.method1("GeeksforGeeks");
		

	}
	
	public static void method1(String s) {
		
		
		char[] d = s.toCharArray();

		for (int i = 0; i <= d.length - 1; i++) {
			int count = 0;
			for (int j = 0; j <= d.length - 1; j++) {
				if (d[i] == d[j]) {
					count++;
				}
			}
			if (count == 1) {
             System.out.println(d[i]);
             break;
			}
		}
		
	}

}
