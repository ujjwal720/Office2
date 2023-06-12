
public class mutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int age = 18;
		// final keyword cannot change this the meaning of final keywords....
		seven k=new seven();
		k.drs();
		

	}

}


 class seven extends eight{
	public seven() {
		super();
		System.out.println("This is constructor");
	}
	
	public void drs() {
		System.out.println("The following is an drs method in java");
	}
	
}

class  eight {
	
	public eight() {
		System.out.println("This is an eight");
	}

	public void hellos() {
		System.out.println("The following is an hellos method");
	}
}