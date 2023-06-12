package OOPS;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String l = "I am in QA in 1Rivet";
		String[] m = l.split(" ");
		for (int i = 0; i <= m.length - 1; i++) {
        StringBuilder k=new StringBuilder(m[i]);
        System.out.print(k.reverse()+" ");
		}

	}

}
