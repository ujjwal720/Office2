
public class tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    o a=new o();
	    System.out.println(a.x);
	    a.nc(12);
	    System.out.println(a.x);
		


	}

}

class o{
	int x=20;
	public void nc(int x) {
		this.x=x;
		System.out.println(x);
		
		
	}
	
}