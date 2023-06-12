package Java;

public class coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  data m=new data();
  m.setdata(m, 2, 3);
  m.getdata(m);
	}

}


class data{
	int data1;
	int data2;
	
	
	
	void setdata(data da,int d1,int d2) {
		this.data1=d1;
		this.data2=d2;
	}
	
	void getdata(data da) {
		System.out.println(da.data1);
		System.out.println(da.data2);
	}
}