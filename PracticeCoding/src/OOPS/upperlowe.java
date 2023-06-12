package OOPS;

public class upperlowe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count method
		char[] a = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z' };
		String h = "abc ABC Abc";
		int sum = 0;
		String[] k = h.split(" ");
        
		for (int i = 0; i <= k.length - 1; i++) {
			char[] f = k[i].toCharArray();

			for (int j = 0; j <= f.length - 1; j++) {
				if (Character.isUpperCase(f[j])) {
					String d = Character.toString(f[j]);
					int count =0;
					for (int l = 0; l <= a.length - 1; l++) {
						count++;
						String fd=Character.toString(a[l]);
						if (d.equalsIgnoreCase(fd)) {
							int p=
							sum=sum+p;
							break;
						}
					}
				}
			}
			
		}

	}

}
