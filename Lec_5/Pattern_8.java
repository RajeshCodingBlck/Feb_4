package Lec_5;
import java.util.*;
public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int row=1;
		
		int nsp1=0;
		int nsp2=(n-2);
		
		
		while(row<=n) {
			
			// Print the Left Space
			int i=1;
			while(i<=nsp1) {
				System.out.print(" "+" ");
				i=i+1;
			}
			
			if(row != (n+1)/2) {
				System.out.print("*"+" ");
			}
			
			// Print the Between Space
			int j=1;
			while(j<=nsp2) {
				System.out.print(" "+" ");
				j=j+1;
			}
			
			//Print the Right Star
			System.out.print("*"+" ");
			
			
			// Preparation for Next Row
			
			if(row<(n+1)/2) {
				nsp1=nsp1+1;
				nsp2=nsp2-2;
			}else {
				nsp1=nsp1-1;
				nsp2=nsp2+2;
			}
			
			System.out.println();
			row=row+1;
		}
	}

}
