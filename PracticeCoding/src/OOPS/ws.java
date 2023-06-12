package OOPS;

 interface ws {
	
public void mfd();

default void mfdm(){
	
}


}

 interface wsm {
	
public void mfd();
public void mfs();


}
 
 
class m implements ws,wsm{

	@Override
	public void mfs() {
		System.out.println("Hellos");
		
	}

	@Override
	public void mfd() {
		// TODO Auto-generated method stub
		System.out.println("Hello this is interface");
	}
	 
 }





