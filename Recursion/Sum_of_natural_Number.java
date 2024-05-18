package Recursion;

import java.util.Scanner;

public class Sum_of_natural_Number {
    
	public static  int  sumOfNaturalNumber(int n) {
		// Take n return sum of first n natural number.	
//			
		if(n==1) { // + Ve Base Case
			return 1;
		}
		
		// -ve Base Case
//		if(n==0) {
//			return 0;
//		}
		
	  // Define the SubProblem
	  int chhota_ans= sumOfNaturalNumber(n-1);// recursion		
	  int mera_ans= n+chhota_ans;	
	  return mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
	   int ans=sumOfNaturalNumber(n);
	   System.out.println(ans);
	   
	}

}
