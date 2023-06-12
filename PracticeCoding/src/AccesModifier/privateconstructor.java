package AccesModifier;

public class privateconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  start.getdata();

	}

}

class start {

	private static start k;

	private start() {

		System.out.println("Hello this an constructor");

	}

	public static start getdata() {
		
	if(k==null) {
		
		k=new start();
		
		return k;
	}
	return k;

	}
}