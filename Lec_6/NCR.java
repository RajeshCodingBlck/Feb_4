package Lec_6;
import java.util.*;
public class NCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
       int r= s.nextInt();
       
       int n_fact=1;
       int r_fact=1;
       int n_minus_r_fact=1;
       
       for(int i=1; i<=n;i++) {
    	   
    	   n_fact= n_fact*i;
       }
       
       for(int i=1; i<=r;i++) {
    	   
    	   r_fact= r_fact*i;
       }
       
       for(int i=1; i<=(n-r);i++) {
    	   
    	   n_minus_r_fact= n_minus_r_fact*i;
       }
       
       System.out.println(i);
       int ncr= n_fact/ (r_fact*n_minus_r_fact);
       System.out.println(ncr);
	
	}

}
