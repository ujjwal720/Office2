package OOPS;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    mf.f1 a=new lm();
    a.ks();
    
	}

}



class mf{
	
	interface f1{
		public void ks();
	}
	
	public void m2() {
		System.out.println("hellos");
	}
}

class d extends mf{
	
	
	public void ks() {
		System.out.println("Hellos");
	}
}


class lm implements mf.f1{

	@Override
	public void ks() {
		System.out.println("Hellos");
		
	}
	
}