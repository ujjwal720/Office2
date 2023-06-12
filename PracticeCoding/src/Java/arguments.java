package Java;

public class arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		msk d=new msk();
		d.student(1, 2);
		
		msk j=new msk();
		j.copy(d);
		
		                   ///the refrence copy is copied in this,this is the main function.
	}

}


class msk{
int i,j;
	
	public void student(int k,int l) {
		i=k;
		j=k;
	}
	
	public void copy(msk d){
		this.i=d.i;
		this.j=d.j;
		
		
	}
	
	
}