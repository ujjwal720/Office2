package PracticePrograms;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflectionpi {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		String g="ds";
		Method f=Reflectionpi.class.getMethod(g);
	  f.invoke(f);

	}
	
public static  void ds() {
	
	    Reflectionpi o=new Reflectionpi();
	    System.out.println(o.getClass().getSuperclass());
		
		System.out.println("This is an reflection api");
	}

}

