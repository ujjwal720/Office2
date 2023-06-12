package Java;

import java.util.Arrays;

public class bargraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {1,5,8,7,4,6,9};
    int[] b= {1,5,8,9,7,8,7};
    int [] c=new int[a.length];
    int d=0;
    int f=0;
    
    
    
    for(int i=a.length-1;i>=0;i--) {
    	
    	int sum=a[i]+b[i]+d;
    	if(sum>9) {
    	String[] h=Integer.toString(sum).split("");
    	  d=Integer.parseInt(h[0]);
    	  c[f]=Integer.parseInt(h[1]);
    	  System.out.println(c[f]);
    	  f++;
    	}
    	else {
    		c[f]=sum;
    		d=0;
    		System.out.println(c[f]);
    		f++;
    	}
    	    
    }
    
    
   
    
	}
}
