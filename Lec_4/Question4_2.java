package Lec_4;
import java.util.*;
public class Question4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();  
      int row=1;
      
      int nsp=n-1; // No of Space
      int nst=1;   // No of Star
      while(row<=n) {
    	  
    	  // Print the Hash
    	  
    	  int i=1;
    	  while(i<=nsp) {
    		  System.out.print(" "+" ");
    		  i=i+1;
    	  }
    	  
    	  // Print the Star
    	  int j=1;
    	  while(j<=nst) {
    		  System.out.print("*"+" ");
    		  j=j+1;
    	  }
    	  
    	  // Preparation for Next Row
    	  nst=nst+1;
    	  nsp=nsp-1;
    	  
    	   System.out.println();
    	   row=row+1;
      }
	}

}
