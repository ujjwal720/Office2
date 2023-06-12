
public class rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        String target="Tim";
		String s = "TimisanTimeaTimeGoodBoyTiitisverybadTim";
		s = s.replaceAll(target, "?");
		String[] p = s.split("");
		for(int i=0;i<=p.length-1;i++) {
		if(p[i].equals("?")) {
			count++;
		}
		}
		System.out.println("There are"+" " + count+" "+ "Terrorist");

	}

}
