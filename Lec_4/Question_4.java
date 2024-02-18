package Lec_4;
import java.util.*;
public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();  
      int row=1;
      
      int n_hash=n-1;
      int nst=1;
      while(row<=n) {
    	  
    	  // Print the Hash  	
    	  int i=1;
    	  while(i<=n_hash) {
    		  System.out.print("# "+" ");
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
    	  n_hash=n_hash-1;
    	  
    	   System.out.println();
    	   row=row+1;
      }
	}

}
