import java.util.ArrayList;

public class coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> c=new ArrayList<>();
	c.add("1");
	c.add("3");
	c.add("4");
	c.add("5");
	
	for(int i=0;i<=c.size()-1;i++) {///for loop solving it
		System.out.println(c.get(i));
	}
	
	for(String i:c) {////for each loop////////////for(type var:array| collection)
		System.out.println(i);
	}
	}

}
