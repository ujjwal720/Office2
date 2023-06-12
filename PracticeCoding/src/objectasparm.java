
public class objectasparm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numbers d=new numbers();
		sum c=new sum();
		c.addition(d);

	}

}


class sum{

	public void addition(numbers b) {
		int c=b.a+b.b;
		System.out.println(c);
	}
	
}

class numbers{
	int a=10;
	int b=10;
}