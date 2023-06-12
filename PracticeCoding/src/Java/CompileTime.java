package Java;

public class CompileTime {
///// in the compile time compiler knows which method to execute this is compile time polymorphism.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Polymorphism d=new Polymorphism();
     d.method1(11, 21);
    
	}

}

class Polymorphism{
	
	public void method1(int a,int b) {
		System.out.println( b);
	}
	
	public void method1(double a,double b) {
		System.out.println(b);
	}
	
}