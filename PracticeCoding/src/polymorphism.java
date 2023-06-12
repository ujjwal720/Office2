
public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ujjwal s=new ujjwal();
		s.js();
		s.js("ujjwal");
		mf u=new mf();
		u.js();
		
	}


}

class mf extends ujjwal{
	public void js() {
		System.out.println("This is an js");
	}
}	

	
	



class ujjwal{
	
	
public void js() {
	System.out.println("This is the following is an js");
}	
	
public void js(String a) {
	System.out.println(a);
}	
	
	
}
