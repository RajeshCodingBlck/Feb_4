package Lec_6;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      
      int product=1;
      
      for(int i=1; i<=n;i++) {
    	  product= product*i;
      }
      System.out.println(product);
      
      
	}

}
