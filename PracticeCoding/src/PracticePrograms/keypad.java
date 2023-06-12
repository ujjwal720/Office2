package PracticePrograms;

public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "xyz";
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] b = {"?","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		for (int i = 0; i <= s.length() - 1; i++) {
			char f = s.charAt(i);
			for (int j = 0; j <= b.length - 1; j++) {
				char[] x = b[j].toCharArray();
				for (int k = 0; k <= x.length - 1; k++) {
					if (f == x[k] && f!='w'&& f!='x'&&f!='y'&& f!='z' ) {
                   System.out.print(j+1);
					}
                  
                    
	                }
					
				}
				

			}
		}

	}



