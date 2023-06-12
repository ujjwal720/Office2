package PracticePrograms;

public class constructor {

	public constructor() {
		System.out.println("This is an constructor");
	}

	public constructor(int a) {
		System.out.println(a);
	}

	public int ujjwal(int d) {
		System.out.println(d);
		return d;

	}

	public void ujjwal(String d) {//////polymorphism
		System.out.println(d);
	}
	public void ujjwal() {
		System.out.println("This is an parent class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor a = new constructor();
	//	constructor b = new constructor(3);
	//	int f = a.ujjwal(2);
		//System.out.println(f);
	//	b.ujjwal(5);
		sm g=new sm();
		g.ujjwal();
		
	}

}

class sm extends constructor{
	 public sm() {
		 System.out.println("This is an child class");
	 }
	 public void ujjwal() {
		 System.out.println("This is an child class method");
	 }
	
}
