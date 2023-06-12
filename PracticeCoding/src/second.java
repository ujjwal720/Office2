
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Apple1234
		//output-apple4321
	String a="Apple1234sdf789";
	String b="";
	String c="";
	StringBuilder result=new StringBuilder();
	
	
	for(int i=0;i<=a.length()-1;i++) {
		if(Character.isLetter(a.charAt(i))) {
			result.append(a.charAt(i));
		}
		
		else {
		  c=c+a.charAt(i);
		}
	}

	StringBuilder d=new StringBuilder(c);
     result.append(d.reverse());
     System.out.println(result);
     
    
	
	
	
		
		
	}

}
