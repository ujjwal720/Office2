package PracticePrograms;

public class sumstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "12abc1a23c";
		String k = "0";
		int sum = 0;
		int count=0;
		for (int i = 0; i <= s.length() - 1; i++) {
			    count++;
			if (Character.isDigit(s.charAt(i))) {
				
				k = k + s.charAt(i);
			} else {
		if(!k.isEmpty()) {
				int l = Integer.parseInt(k);
				sum = sum + l;
				k="0";
			}
		
		  
		
			}

			}
		 if(s.length()==count) {
				int l = Integer.parseInt(k);
				sum = sum + l;
				l=0;
				k="0";
		   }
		 System.out.println(sum);
		}

	}


