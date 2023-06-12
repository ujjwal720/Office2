
public class refrencevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ui a=new ui();
		System.out.println(a.n+" "+ "Direct calling");
		a.x(a.n);
		System.out.println(a.n+" "+ "Direct calling");
		
	

	}

}

class ui{
	int n=500;
	
	public void x(int n) {
		n=n+n;//local scope
		System.out.println(n);
		
	}
}