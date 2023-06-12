package PracticePrograms;

public class ns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mf a=new mf("Ujjwal");
		

	}

}

class mf {

	public mf() {
		this("Ujjwal");
		System.out.println("This is default constructor");
	}

	public mf(String s) {
         this(1);
		System.out.println("This is second constructor");
	}

	public mf(int s) {
		System.out.println("This is third constructor");
	}

}