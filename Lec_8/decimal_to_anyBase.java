package Lec_8;
import java.util.*;
public class decimal_to_anyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      int b= s.nextInt();
      
      int place_value=1;
      int ans=0;
      
      while(n>0) {
    	  
    	  int rem= n%b;
    	  ans= ans+ rem*place_value;
    	  
    	  place_value*=10;
    	  n= n/b;
      }
      
      System.out.println(ans);
	}

}
