package AccesModifier;

public class exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			int a=10/0;

		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
		try {
			
			int a=10/0;
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}

	}

}
