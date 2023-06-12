package PracticePrograms;

public class javagenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   lion<String> a=new lion<>();
   a.t="1";
   
	}

}


/*
 Java generics it will 
 basically provide the type saftery thing
 like we hve seen in arraylist we basically mentio
 what we need to be passed.
*/


class lion<T extends String>{
	
	T t;
	
	public void ui() {
		System.out.println(t);
	}
}