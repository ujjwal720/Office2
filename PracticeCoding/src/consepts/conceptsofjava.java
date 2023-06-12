package consepts;

import consepts.c.d;

public class conceptsofjava {

	public conceptsofjava() {
		// TODO Auto-generated constructor stub

		System.out.println("This is super class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub]

		System.out.println("This is the main class");

		

	}

}

class c {

	private int a = 10;

	public c() {

		System.out.println("This is upper constructor");
	}

class d {

		int x = 5;

		public d() {
			System.out.println("This is lower constructor");
		}

		public  void method1() {
			System.out.println(this.x);

			System.out.println(a);
		}
	}
}