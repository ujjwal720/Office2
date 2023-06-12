package OOPS;

public class exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       kd a=new kd();
	}

}

class md{
	public md(){
		System.out.println("The following is and constructor");
	}
	public void u() {
		System.out.println("The following is an u");
	}
	public md(int l) {
		System.out.println(l);
	}
}

class kd extends md{
	
	public kd() {
		this(15);
		super();
	}
	
	
	public void hm() {
		u();
		
		
	}
}