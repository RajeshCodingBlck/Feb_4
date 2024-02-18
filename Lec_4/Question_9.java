package Lec_4;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  Scanner s= new Scanner(System.in);
	  
	  int n= s.nextInt();
	  
	  int row=1;
	  int nsp=n-1;
	  int nst=1;
	  while(row<=n) {
		  
		  // Print the Space
		  int i=1;  // ith Space 
		  while(i<=nsp) {
			  System.out.print(" "+" ");
			  i=i+1;
		  }
		  
		  int j=1; // jth Star
		  while(j<=nst) {
			  
			  System.out.print("*"+ "");
			  j=j+1;
		  }
		  
		  // Preparation for Next Row
		  
		  nst=nst+2;
		  nsp=nsp-1;
		  
		  System.out.println();
		  row=row+1;
	  }
		
	}


}
