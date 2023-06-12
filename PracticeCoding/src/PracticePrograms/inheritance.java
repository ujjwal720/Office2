package PracticePrograms;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gh a=new gh();
	    a.fs("1");
	   a.fgh("hello");

	}

}


class gh{
	String s;
	
	public void fs(String a) {
		  
		s=a;
		System.out.println(a);
		
		
	}
	
	public gh(){
		System.out.println("This is constructor");
	}
	
	public void fgh(String h) {
		this.s=h;
		System.out.println(h);
	}
	
	
	
	
}