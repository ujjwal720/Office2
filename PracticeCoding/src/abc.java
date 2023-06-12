
public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="a4b4c3";
String result="";
String d="";

for(int i=0;i<=a.length()-1;i++) {
	if(Character.isLetter(a.charAt(i))) {
	   Character s=a.charAt(i);
	   d=s.toString();
	}
	else {
     Character c= a.charAt(i);
     String f=c.toString();
     int m=Integer.parseInt(f);
     for(int j=1;j<=m;j++) {
    	 result=result+d;
     }
    
     
     
     
	}
	
	System.out.print(result);
	result="";
	
	
}
		
		
		
	}

}
