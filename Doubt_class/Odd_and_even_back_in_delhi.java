import java.util.*;
public class Main {
	public static void fun(int n){

		 int sum_even=0;
		 int sum_odd=0;

		 while(n>0){

			 int last_digit= n%10;

			 if(last_digit%2==0){
				 sum_even+=last_digit;
			 }else{
				 sum_odd+=last_digit;
			 }

			 n=n/10;
		 }

		 if(sum_even%4==0 || sum_odd%3==0){
			 System.out.println("Yes");
		 }else{
			 System.out.println("No");
		 }
		 
	}
    public static void main(String args[]) {
     
	  Scanner s= new Scanner(System.in);
	  int t= s.nextInt();


	  for(int i=1; i<=t;i++){

		  int n= s.nextInt();
		     fun(n);
	  }


    }
}
