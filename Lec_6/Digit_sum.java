package Lec_6;
import java.util.*;
public class Digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
       
       int sum=0;
       
       for( ;n>0; ) {
    	   
    	   int last_digit= n%10;
    	   sum= sum+ last_digit;
    	   
    	   n= n/10;
       }
       System.out.println(sum);
       
	}

}
