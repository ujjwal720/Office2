package OOPS;

public class fs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     m a=new m();
     a.m1();
	}

}




class m extends t{
	
	private void m1() {
		System.out.println("This is an child class");
	}
}

 class  t{
	
public  void m1() {
		System.out.println("This is parent class");
	}
	
}