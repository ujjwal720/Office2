package PracticePrograms;

public class SWAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mobile a = new mobile();
		mobile b = new mobile();
		a.count();
		System.out.println(a.a);
		System.out.println(b.a);/////with new object it will show 10
	    b.count();
		System.out.println(a.a);
		System.out.println(b.a);
		a.m();
		a.change();
		b.change();
		
	     
		
		
	    

	}

}

class mobile {
	 static int  a =10;
	

	public void display(int b) {
		int c = b + a;
		System.out.println(c);
	}

	public void displaym(int b) {
		int c = b + a;
		System.out.println(c);
	}

	public void count() {
		a++;
		System.out.println(a);
		
	}
	
public static  void m() {
    a=15;
	}
	
	public void change() {
		System.out.println(a);
	}
	
	static {
		System.out.println("This is static method");
	}
	
	public mobile(){
		System.out.println("The following is constructor");
	}

}