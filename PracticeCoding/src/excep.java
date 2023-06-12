
public class excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		int[] a= {1,2,3,4,5};
		System.out.println(a[1]);
		} 
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("This is an exception");
		} 
		
		finally {
			System.out.println("his is an finally block");
		}
		

	}

}
