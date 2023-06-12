package AccesModifier;

public class tightlyencapsulatedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}

}

/*
 * Sinc the parent class is not tightly encapuslated so no class is tighly encapsulayed.
 */


class ty{
	
	
	public void takes() {
		
		System.out.println("The following us an takes method");
	}
	
	
int x=10;
}


abstract class  my extends ty{
	private int a=10;
	
	@Override
	public abstract void takes();

}


class me extends ty{
	private int a=10;
	
}