package Java;

public class Runtime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		yrf g=new yrf();
		g.d();
		////In this compiler do not know now which method to use,it will decide at run time which to call.
	}

}

class yrf extends msd{
	
	public void d() {
		System.out.println("I am from d class");
	}
}





class msd{
	
	
	public void d() {
		System.out.println("Hi i am from msd class");
	}
	
	
}