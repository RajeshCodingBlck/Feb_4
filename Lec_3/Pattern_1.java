package Lec_3;
import java.util.*;
public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  Scanner s= new Scanner(System.in);
	  int n= s.nextInt();
	  
	  int row=1;
	  
	  while(row<=n) {
		  
//		   work
		  int i=1;  
		  while(i<=n) {
			  System.out.print("*");
			  i=i+1;
		  }
		  
		  System.out.println();
		  row=row+1;
		  
	  }
	  
		
	}

}
