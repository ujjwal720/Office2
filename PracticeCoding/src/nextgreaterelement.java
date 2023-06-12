import java.util.ArrayList;
import java.util.List;

public class nextgreaterelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 13, 10, 9 };

		for (int i = 0; i <= a.length - 1; i++) {

			int next = -1;
			List<Integer> b = new ArrayList<Integer>();

			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[i] < a[j]) {

					next = a[j];
					b.add(a[i]);
					b.add(next);
					break;

				}

			}
			
			if(next==-1) {
				
				b.add(a[i]);
				b.add(next);
			}
			System.out.println(b);
		}

	}

}
