
public class ina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ms a=new ms();
		System.out.println(a instanceof cgi);

	}

}


class cgi{
	
	
	public void cgi1(){
		
		System.out.println("Hello this an cgi2");
	}
}


class ms extends cgi{
	
	
	public void us() {
		System.out.println("This is an instance thing");
	}
}

