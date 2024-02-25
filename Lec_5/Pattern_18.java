package Lec_5;
import java.util.*;
public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	   Scanner s= new Scanner(System.in);
	   
	   int n= s.nextInt();
	   
	   int row=1;
	   int nsp=(n-1)/2;
	   int nst=1;
	   while(row<=n) {
		   
		   // Print the Space
		   int i=1;
		   while(i<=nsp) {
			   System.out.print(" "+" ");
			   i=i+1;
		   }
		   
		   // Print  the Star
		   int j=1;
		   while(j<=nst) {
			   System.out.print("*"+" ");
			   j=j+1;
		   }
		   
		   // Preparation for Next row
		   
		   if(row<(n+1)/2) {
			   nsp=nsp-1;
			   nst=nst+2;
		   }else {
			   nsp=nsp+1;
			   nst=nst-2;
		   }
		   
		   System.out.println();
		   row=row+1;
	   }
	}

}
