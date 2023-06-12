package PracticePrograms;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//polymorphism means diffrent forms that only i know 
		
		ujjwal a=new ujjwal();//object//ujjwal is an class a is an object
		a.bmw();
		a.bmc("Ujjwal");
		a.car("Ujjwal");
		
		

	}

}

class ujjwal{
	
	public void car() {
		System.out.println("This is a car of ujjwal");
	}
	
	public void bmw() {
		System.out.println("This is also and car but is bmw");
	}
	
	public void bmc(String s) {
		System.out.println("This is an " + s);
	}
	
	public void car(String d) {
		System.out.println("This is anc ompany car"+ " " + d);
	}
	
	
}