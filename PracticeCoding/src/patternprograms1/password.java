package patternprograms1;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "74bcdefA";
		int c=0;
		int sm=0;
		int d=0;
		int n=0;

		for (int i = 0; i <= s.length() - 1; i++) {
              if(Character.isLowerCase(s.charAt(i))) {
            	  c++;
              } 
              if(Character.isUpperCase(s.charAt(i))) {
            	  sm++;
              }
              
              if(i>0 && Character.isDigit(s.charAt(i))) {
            	  d++;
              }
              if(i==0 && Character.isDigit(s.charAt(i)) ) {
            	  n++;
              }
                
		}
		if(c>0 && sm>0 && d>0 && s.length()>=4 && n!=1) {
			System.out.println("Pssword is valid");
		}
		else {
			System.out.println("Password is invaid");
		}

	}

}
