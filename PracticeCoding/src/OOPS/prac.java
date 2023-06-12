package OOPS;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ts a = new ts();
		a.hellos();
	}

}

class ts extends ncb {

	public void hellos() {
		System.out.println("Out");
		super.khan();
	}
}

class ncb {

	public void khan() {
		System.out.println("Ncb knock");
	}

}