package Java;

public class bat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "batisinthekitchenbatonthebatbatbatsbase";
		String target = "bat";
		String[] b = s.split("");
		String[] h=target.split("");

		for (int i = 0; i <= b.length - 1; i++) {
			if (b[i].equals(h[0])) {
				String k = "";
				for (int j = i; j <= i + target.length()-1; j++) {
					k = k + b[j];
					if (k.equals(target)) {
						System.out.println(i);
					}
				}
			}
		}

	}

}
