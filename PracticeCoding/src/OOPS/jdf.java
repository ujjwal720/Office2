package OOPS;

public class jdf {

	public static void main(String[] args) {
		
	
		  String s1="mam";
          System.out.println(new cgi(1,"Ujjwal").toString());
          System.out.println(s1.toString());
          StringBuffer sd=new StringBuffer("and");
          System.out.println(sd.toString());
          String i="Ujjwal";
          String j="Ujjwal";
          System.out.println(i.equals(j));
          String k=new String("Ram");
          //String k=new String("Ram");
          //System.out.println(k.equals(lm));
          jdf g=new jdf("Ram");
          jdf b=new jdf("Ram");
          System.out.println(k.equals(k));
         
          
	}
	
	public jdf(String s) {
		s="Ram";
	}

}


class cgi{
	
	int id;
	String s;
	
	public cgi(int id,String s){
	   this.id=id;
	   this.s=s;
	}
	
	public  String toString() {
		return id+s;
	}
	
}
