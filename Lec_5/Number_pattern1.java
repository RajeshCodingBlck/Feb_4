package Lec_5;

import java.util.*;
public class Number_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	 Scanner s= new Scanner(System.in);
	 int n= s.nextInt();
	 
	 int row=1;
	 int nsp=n-1;
	 int nst=1;
	 int rowval=1;
	 while(row<=n) {
		 
		 // Print the Space
		 int i=1;
		 while(i<=nsp) {
			System.out.print(" "+" ");
			i=i+1;
		 }
		 
		 // Print the Star
		 int j=1;
		 int colval=rowval;
		 while(j<=nst) {
			 System.out.print(colval+" ");
			
			 if(j <(nst+1)/2) {
				 colval=colval+1;
			 }else {
				 colval=colval-1;
			 }
			 j=j+1;
		 }
		 
		 // Preparation for next Row
		 nsp=nsp-1;
		 nst=nst+2;
		 rowval= rowval+1;
		 
		 System.out.println();
		 row=row+1;
	 }
			
		
	}

}
