
public class firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] a= {1,2,1,1,2,1,3,2,1,4};
	for(int i=0;i<=a.length-1;i++) {
	if(a[i]!=-1) {	
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]==a[j]) {
				a[j]=-1;
			}

	}
	
	}	
	}

}
}