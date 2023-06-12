package AccesModifier;

public class aegs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ui a=new pi();
		a.ux(1);
		
		pi b=new pi();
		b.ux(1);

	}

}

class ui {

	public void ux(int i) {
		
		System.out.println("The following us is parent method");

	}
}


class pi extends ui{
	
public void ux(int...i) {
		
		System.out.println("The following is any number of parameters ");

	}
}
	
	
	
