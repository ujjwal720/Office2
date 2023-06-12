
public class lengf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String h="Hate java";
		int count=0;
		for(int i=0;i<=h.length()-1;i++) {
			if(Character.isLetter(h.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
