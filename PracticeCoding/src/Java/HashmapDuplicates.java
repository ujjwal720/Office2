package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> x = new HashMap<Integer, Integer>();
//if we put key we get value
		List<Integer> y = new ArrayList<Integer>();

		y.add(1);
		y.add(2);
		y.add(2);
		y.add(1);
		y.add(3);
	

		for (int i = 0; i <= y.size() - 1; i++) {
			if (x.containsKey(y.get(i))) {

				x.put(y.get(i), x.get(y.get(i)) + 1);

			} else {
				x.put(y.get(i), 1);
			}

		}

		System.out.println(x);

	}

}
