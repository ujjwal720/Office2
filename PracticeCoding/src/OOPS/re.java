package OOPS;


import OOPS.ab.bde;


public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	bde h=new bde();
    h.m1();
		
	
		

	}

}


abstract class rdm{
	
	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}


abstract class ab extends rdm{

	@Override
	public void m1() {
		System.out.println("This is the first implementation");
		
}
	


	
	
}

 class bde extends ab{

	@Override
	public void m2() {
		System.out.println("Hellos");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("dj");
		
	}
	
}