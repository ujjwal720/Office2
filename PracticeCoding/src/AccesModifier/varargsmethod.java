package AccesModifier;

public class varargsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a a=new a();
		a.abc(1);
		a.abc(1,2);

	}

}


class a{
	
	
	
	
	
	public void abc(int a) {
		
		System.out.println("This following is an simple mehod");
	}
	
public void abc(int...a) {
		
		System.out.println("This following is an simple varsgs mehod");
	}
}