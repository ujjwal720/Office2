package Java;

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car f=new bike();
		
		

	}

}

////so every class contain an super by default so when we call it it get called

class car{
	int speed=100;
	int m=10;
	
	public car(int m) {
		System.out.println(this.m);
	}
	
	public car() {
		System.out.println("Hello");
	}
}

class bike extends car{
	
	int speed=300;

	public bike(){
		System.out.println(speed);
		
	}
}