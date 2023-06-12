package Java;

public class fid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       k o=new k();
       o.display(1);
	}

}


class k extends u{
	public void display(int g){
		System.out.println("COME AND SAY HI");
	}
}



class u{
	
	final int x=10;
	
	final void display() {
		System.out.println("This is an final keyword");
	}
	
	final public void display(String g) {
		System.out.println(g);
	}
	
	
}

